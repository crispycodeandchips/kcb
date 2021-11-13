package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Brewery;
import com.crispycode.kcb.model.BreweryEvent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EventMapper {
    List<BreweryEvent> selectEventByBreweryId();
    List<BreweryEvent> selectRecentEvents();
}
