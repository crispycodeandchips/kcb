package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Brewery;
import com.crispycode.kcb.model.Brewpub;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BrewpubMapper {
    Brewpub selectBrewpubById(Integer id);
    List<Brewpub> selectAll();
}
