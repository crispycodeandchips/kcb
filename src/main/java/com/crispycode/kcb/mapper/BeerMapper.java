package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Beer;
import com.crispycode.kcb.model.LineUpBeer;
import com.crispycode.kcb.model.Vo;
import com.crispycode.kcb.model.VoTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Mapper
public interface BeerMapper {
    List<LineUpBeer> selectByBreweryId(Integer id);
    List<Beer> selectAll();
    List<Beer> selectRecentBeers();
    void insertImage(@Param("file") VoTest file);
}
