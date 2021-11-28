package com.crispycode.kcb.model;

import com.crispycode.kcb.dto.GoodsDetailResponseDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer goodsId;
    private String name;
    private Integer price;
    private byte[] goodsImage;
    private String summary;

    public GoodsDetailResponseDto toDetailDto() {
        return GoodsDetailResponseDto.builder()
                .id(goodsId)
                .name(name)
                .price(price)
                .summary(summary)
                .goodsImage(goodsImage)
                .build();
    }
}
