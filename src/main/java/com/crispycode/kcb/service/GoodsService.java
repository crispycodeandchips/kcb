package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.dto.GoodsDetailResponseDto;
import com.crispycode.kcb.dto.GoodsMainResponseDto;
import com.crispycode.kcb.mapper.GoodsMapper;
import com.crispycode.kcb.model.*;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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

    public List<Goods> getRecentList(){
        return goodsMapper.selectRecentGoods();
    }

    public void saveImage(Vo vo) {
        byte[] bytes = new byte[0];
        try {
            bytes = vo.getImgFile().getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        goodsMapper.insertImage(
                VoTest.builder().id(vo.getId()).bytes(new ByteArrayInputStream(bytes)).build());
    }
}
