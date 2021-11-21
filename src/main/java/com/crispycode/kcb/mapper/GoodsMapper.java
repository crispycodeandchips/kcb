package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    List<Goods> selectGoods();
    Goods selectById(Integer id);

}
