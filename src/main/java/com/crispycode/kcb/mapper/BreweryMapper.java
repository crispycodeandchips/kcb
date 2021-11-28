package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Beer;
import com.crispycode.kcb.model.Brewery;
import com.crispycode.kcb.model.VoTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper //Mybatis가 Mapper라는걸 인식해야함.
public interface BreweryMapper {
    Brewery selectBreweryById(Integer id);
    List<Brewery> selectAll();
    List<Brewery> selectRecentBreweries();
    void insertImage(@Param("file") VoTest file);
}
