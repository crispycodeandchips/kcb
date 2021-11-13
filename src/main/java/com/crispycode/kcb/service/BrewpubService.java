package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BrewpubBeerResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
import com.crispycode.kcb.mapper.BrewpubMapper;
import com.crispycode.kcb.model.Brewpub;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BrewpubService {

    private final BrewpubMapper brewpubMapper;

    public Brewpub getBrewpub(Integer id) {

        Brewpub brewpub = brewpubMapper.selectBrewpubById(id);
        return brewpub;
    }
}
