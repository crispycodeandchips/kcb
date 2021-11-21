package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.dto.GoodsDetailResponseDto;
import com.crispycode.kcb.dto.GoodsMainResponseDto;
import com.crispycode.kcb.mapper.GoodsMapper;
import com.crispycode.kcb.model.Beer;
import com.crispycode.kcb.model.Goods;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GoodsService {
    private final GoodsMapper goodsMapper;

    public List<GoodsMainResponseDto>getList() {
        List<Goods> goodsList = goodsMapper.selectGoods();
        List<GoodsMainResponseDto> dtoList = goodsList
                .stream()
                .map(goods -> new GoodsMainResponseDto(
                goods.getGoodsId(), goods.getGoodsImage(), goods.getName(), goods.getPrice()))
                .collect(Collectors.toList());
        return dtoList;
    }



    public GoodsDetailResponseDto getGoods(Integer id) {
        Goods goods = goodsMapper.selectById(id);
        return goods.toDetailDto();
    }
}
