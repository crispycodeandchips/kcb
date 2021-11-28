package com.crispycode.kcb.controller;

import com.crispycode.kcb.model.Vo;
import com.crispycode.kcb.service.BeerService;
import com.crispycode.kcb.service.BreweryService;
import com.crispycode.kcb.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/blobs")
public class BlobController {
    private final BeerService beerService;
    private final BreweryService breweryService;
    private final GoodsService goodsService;

    @PostMapping("/beer")
    public ResponseEntity postBeerImage(Vo vo){
            beerService.saveImage(vo);

        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/brewery")
    public ResponseEntity postBreweryImage(Vo vo){
        breweryService.saveImage(vo);

        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/goods")
    public ResponseEntity postGoodsImage(Vo vo){
        goodsService.saveImage(vo);

        return new ResponseEntity(HttpStatus.OK);
    }

}
