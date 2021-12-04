package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.BreweryEvent;
import com.crispycode.kcb.model.VoTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EventMapper {
    List<BreweryEvent> selectEventByBreweryId(Integer id);
    List<BreweryEvent> selectRecentEvents();
    void insertImage(@Param("file") VoTest file);
}
