package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.dto.BreweryEventResponseDto;
import com.crispycode.kcb.dto.BreweryLineupResponseDto;
import com.crispycode.kcb.dto.BreweryMapResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
import com.crispycode.kcb.mapper.BreweryMapper;
import com.crispycode.kcb.mapper.EventMapper;
import com.crispycode.kcb.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BreweryService {
    private final BreweryMapper breweryMapper;
    private final BeerMapper beerMapper;
    private final EventMapper eventMapper;

    public BreweryLineupResponseDto getLineup (Integer id){

        Brewery brewery = breweryMapper.selectBreweryById(id);
        List<LineUpBeer> lineUpBeerList = beerMapper.selectByBreweryId(id);
        BreweryLineupResponseDto dto = BreweryLineupResponseDto.builder()
                .breweryName(brewery.getBreweryName())
                .address(brewery.getAddress())
                .contact(brewery.getPhone())
                .homepageUrl(brewery.getHomepage())
                .instagram(brewery.getInstagram())
                .lineups(lineUpBeerList)
                .image(brewery.getImage())
                .build();
        return dto;
    }
    public BreweryEventResponseDto getEvents (Integer id) {
        Brewery brewery = breweryMapper.selectBreweryById(id);
        List<BreweryEvent> breweryEvent = eventMapper.selectEventByBreweryId(id);
        BreweryEventResponseDto dto = BreweryEventResponseDto.builder()
                .breweryName(brewery.getBreweryName())
                .address(brewery.getAddress())
                .contact(brewery.getPhone())
                .homepageUrl(brewery.getHomepage())
                .instagram(brewery.getInstagram())
                .events(breweryEvent)
                .build();
        return dto;
    }

    public List<BreweryMapResponseDto> getMap() {
       List<Brewery> breweries =  breweryMapper.selectAll();
       List<BreweryMapResponseDto> dtoList = breweries.stream()
               .map(brewery -> new BreweryMapResponseDto(
                       brewery.getLatitude(), brewery.getLongitude(), brewery.getBreweryName()))
                .collect(Collectors.toList());
        return dtoList;
    }

    public List<Brewery> getRecentList(){
        return breweryMapper.selectRecentBreweries();
    }

    public void saveImage(Vo vo) {
        byte[] bytes = new byte[0];
        try {
            bytes = vo.getImgFile().getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        breweryMapper.insertImage(
                VoTest.builder().id(vo.getId()).bytes(new ByteArrayInputStream(bytes)).build());
    }
}
