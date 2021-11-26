package com.crispycode.kcb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Beer {

    private byte[] beerImage;
    private String beerName;
    private LocalDate releaseDate;
    private String breweryName;
}
