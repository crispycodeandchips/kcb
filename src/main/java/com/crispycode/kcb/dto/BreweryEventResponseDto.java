package com.crispycode.kcb.dto;

import com.crispycode.kcb.model.BreweryEvent;
import com.crispycode.kcb.model.LineUpBeer;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreweryEventResponseDto {

    private String breweryName;
    private byte[] image;
    private String address;
    private String contact;
    private String homepageUrl;
    private String instagram;

    private List<BreweryEvent> events;
}
