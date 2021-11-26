package com.crispycode.kcb.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BrewpubMapResponseDto {

    private double latitude;
    private double longitude;
    private String brewpubName;
}
