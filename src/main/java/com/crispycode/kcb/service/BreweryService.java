package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BreweryEventResponseDto;
import com.crispycode.kcb.dto.BreweryLineupResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
import com.crispycode.kcb.mapper.BreweryMapper;
import com.crispycode.kcb.mapper.EventMapper;
import com.crispycode.kcb.model.BreweryEvent;
import com.crispycode.kcb.model.LineUpBeer;
import com.crispycode.kcb.model.Brewery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BreweryService {
    private final BreweryMapper breweryMapper;
    private final BeerMapper beerMapper;
    private final EventMapper eventMapper;

    public BreweryLineupResponseDto getLineup (Integer id){

        Brewery brewery = breweryMapper.selectBreweryById();
        List<LineUpBeer> lineUpBeerList = beerMapper.selectByBreweryId();
        BreweryLineupResponseDto dto = BreweryLineupResponseDto.builder()
                .breweryName(brewery.getBreweryName())
                .address(brewery.getAddress())
                .contact(brewery.getPhone())
                .homepageUrl(brewery.getHomepage())
                .instagram(brewery.getInstagram())
                .lineups(lineUpBeerList)
                .build();
        return dto;
    }
    public BreweryEventResponseDto getEvents (Integer id) {
        Brewery brewery = breweryMapper.selectBreweryById();
        List<BreweryEvent> breweryEvent = eventMapper.selectEventByBreweryId();
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
}
