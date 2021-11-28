package com.crispycode.kcb.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDetailResponseDto {

    private Integer id;
    private byte[] goodsImage;
    private String name;
    private Integer price;
    private String summary;

}
