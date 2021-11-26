package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
import com.crispycode.kcb.model.Beer;
import com.crispycode.kcb.model.Vo;
import com.crispycode.kcb.model.VoTest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BeerService {
    private final BeerMapper beerMapper;
    public List<BeerResponseDto> getList (){
        List<Beer> beerList = beerMapper.selectAll();
        List<BeerResponseDto> dtoList = beerList.stream()
                //lambda + stream  찾아보세요!
                .map(beer -> new BeerResponseDto(
                        beer.getBeerImage(), beer.getBeerName(), beer.getBreweryName(), beer.getReleaseDate()))
                .collect(Collectors.toList());
        return dtoList;
    }

    public List<Beer> getRecentList(){
        return beerMapper.selectRecentBeers();
    }

    public void saveImage(Vo vo) {
        byte[] bytes = new byte[0];
        try {
            bytes = vo.getImgFile().getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        beerMapper.insertImage(
                VoTest.builder().id(vo.getId()).bytes(new ByteArrayInputStream(bytes)).build());
    }
}
