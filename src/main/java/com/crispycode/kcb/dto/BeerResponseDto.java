package com.crispycode.kcb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeerResponseDto {

    private byte[] beerImage;
    private String beerName;
    private String breweryName;
    private LocalDate releaseDate;
}
