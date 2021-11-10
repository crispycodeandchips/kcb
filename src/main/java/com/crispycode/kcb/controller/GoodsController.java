package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.dto.GoodsResponseDto;
import com.crispycode.kcb.model.Goods;
import com.crispycode.kcb.service.BeerService;
import com.crispycode.kcb.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/goods")
public class GoodsController {
    private final GoodsService goodsService;

    @GetMapping
    public ResponseEntity<List<Goods>> getGoodsList(){

        return new ResponseEntity(goodsService.getList(), HttpStatus.OK);
    }
}
