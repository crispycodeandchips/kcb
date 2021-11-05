package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BreweryLineuplResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
import com.crispycode.kcb.mapper.BreweryMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BreweryService {
    private final BreweryMapper breweryMapper;
    private final BeerMapper beerMapper;
    public BreweryLineuplResponseDto getLineup (Integer id){

    }
}
