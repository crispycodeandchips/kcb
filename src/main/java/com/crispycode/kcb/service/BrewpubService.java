package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BreweryMapResponseDto;
import com.crispycode.kcb.dto.BrewpubBeerResponseDto;
import com.crispycode.kcb.dto.BrewpubMapResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
import com.crispycode.kcb.mapper.BrewpubMapper;
import com.crispycode.kcb.model.Brewery;
import com.crispycode.kcb.model.Brewpub;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BrewpubService {

    private final BrewpubMapper brewpubMapper;

    public Brewpub getBrewpub(Integer id) {

        Brewpub brewpub = brewpubMapper.selectBrewpubById(id);
        return brewpub;
    }

    public List<BrewpubMapResponseDto> getMap() {
        List<Brewpub> brewpubs =  brewpubMapper.selectAll();
        List<BrewpubMapResponseDto> dtoList = brewpubs.stream()
                .map(brewpub -> new BrewpubMapResponseDto(
                        brewpub.getLatitude(), brewpub.getLongitude(), brewpub.getBrewpubName()))
                .collect(Collectors.toList());
        return dtoList;
    }
}
