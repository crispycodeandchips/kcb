package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BreweryLineuplResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
import com.crispycode.kcb.mapper.BreweryMapper;
import com.crispycode.kcb.model.Brewery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BreweryService {
    private final BreweryMapper breweryMapper;
    private final BeerMapper beerMapper;
    public Brewery getLineup (Integer id){

        Brewery brewery = breweryMapper.selectBreweryById();
        return brewery;
    }
}
