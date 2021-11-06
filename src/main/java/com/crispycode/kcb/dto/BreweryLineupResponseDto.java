package com.crispycode.kcb.dto;

import com.crispycode.kcb.model.LineUpBeer;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreweryLineupResponseDto {

    private String breweryName;
    private String imageUrl;
    private String address;
    private String contact;
    private String homepageUrl;
    private String instagram;

    private List<LineUpBeer> lineups;




}
