package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Brewery;
import com.crispycode.kcb.model.Goods;
import com.crispycode.kcb.model.VoTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {

    List<Goods> selectGoods();
    Goods selectById(Integer id);

    List<Goods> selectRecentGoods();
    void insertImage(@Param("file") VoTest file);
}
