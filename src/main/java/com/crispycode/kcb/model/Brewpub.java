package com.crispycode.kcb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brewpub {
    private String image;
    private String brewpubName;
    private String address;
    private String phone;
    private String homepage;
    private String facebook;
    private String instagram;
    private String summary;
    private double latitude;
    private double longitude;
}
