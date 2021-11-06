package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Beer;
import com.crispycode.kcb.model.LineUpBeer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BeerMapper {
    List<LineUpBeer> selectByBreweryId();
    List<Beer> selectAll();
}
