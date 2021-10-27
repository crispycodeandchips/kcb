package com.crispycode.kcb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeerResponseDto {

    private String name;
    private String brewery;
    private String image;

    private List<BeerResponseDto> Beers;
}
