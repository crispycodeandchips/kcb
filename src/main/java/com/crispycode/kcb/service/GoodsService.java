package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.dto.GoodsResponseDto;
import com.crispycode.kcb.mapper.BeerMapper;
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

    public List<Goods> getList() {
        List<Goods> goodsList = goodsMapper.selectGoods();
        return goodsList;
    }
}
