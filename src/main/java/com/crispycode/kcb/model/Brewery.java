package com.crispycode.kcb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brewery {

    private String breweryName;
    private String image;
    private String address;
    private String phone;
    private String homepage;
    private String instagram;
    private String summary;

    //SELECT br.brewery_name, br.image, br.address, br.phone, br.homepage, br.instagram, br.summary
    //        FROM brewery br
    //        WHERE brewery_id = 6;
}