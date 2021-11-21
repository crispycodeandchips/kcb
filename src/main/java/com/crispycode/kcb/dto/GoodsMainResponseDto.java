package com.crispycode.kcb.dto;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoodsMainResponseDto {

    private Integer id;
    private String goodsImage;
    private String name;
    private Integer price;

}
