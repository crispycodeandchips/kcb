package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Brewery;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper //Mybatis가 Mapper라는걸 인식해야함.
public interface BreweryMapper {
    Brewery selectBreweryById(Integer id);
    List<Brewery> selectAll();
}
