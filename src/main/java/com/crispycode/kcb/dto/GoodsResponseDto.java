package com.crispycode.kcb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoodsResponseDto {

    private String goodsImage;
    private String name;
    private String price;

}
