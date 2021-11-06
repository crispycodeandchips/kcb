package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/beers")
public class BeerController {

    private final BeerService beerService;

    @GetMapping
    public ResponseEntity<List<BeerResponseDto>> getBeerList(){

        return new ResponseEntity(beerService.getList(), HttpStatus.OK);
    }
}
