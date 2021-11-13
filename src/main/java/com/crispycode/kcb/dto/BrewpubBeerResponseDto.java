package com.crispycode.kcb.dto;

import com.crispycode.kcb.model.LineUpBeer;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrewpubBeerResponseDto {

    private String image;
    private String brewpubName;
    private String address;
    private String phone;
    private String homepage;
    private String facebook;
    private String instagram;
    private String summary;

    private List<LineUpBeer> beers;

}
