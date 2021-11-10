package com.crispycode.kcb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer goodsId;
    private String name;
    private Integer price;
    private String goodsImage;
}
