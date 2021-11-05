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
public class BreweryLineuplResponseDto {

    private String breweryName;
    private String imageUrl;
    private String address;
    private String contact;
    private String homepageUrl;
    private String instagram;

    private List<BreweryBeerResponseDto> lineups;




}
