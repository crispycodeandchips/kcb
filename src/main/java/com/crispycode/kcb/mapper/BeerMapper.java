package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Beer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BeerMapper {
    List<Beer> selectByBreweryId();
}
