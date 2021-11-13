package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Brewpub;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BrewpubMapper {
    Brewpub selectBrewpubById(Integer id);
}
