package com.crispycode.kcb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Beer {

    private String beerName;
    private String beerImage;
    private String location;
    private String style;
    private String abv;


//    SELECT beer_name, beer_image, location, style, abv
//    FROM beer
//    WHERE brewery_id = 6;
}
