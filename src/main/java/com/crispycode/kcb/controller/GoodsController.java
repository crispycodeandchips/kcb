package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.GoodsDetailResponseDto;
import com.crispycode.kcb.dto.GoodsMainResponseDto;
import com.crispycode.kcb.dto.PaginationDto;
import com.crispycode.kcb.service.GoodsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/goods")
public class GoodsController {
    private final GoodsService goodsService;

    @GetMapping
    public ResponseEntity<List<GoodsMainResponseDto>> getGoodsList(PaginationDto page){
        return new ResponseEntity(goodsService.getList(page), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GoodsDetailResponseDto> getGoods(@PathVariable Integer id){

        return new ResponseEntity(goodsService.getGoods(id), HttpStatus.OK);
    }
}
