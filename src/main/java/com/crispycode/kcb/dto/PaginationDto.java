package com.crispycode.kcb.dto;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaginationDto {

    @ApiParam(value = "페이지", defaultValue = "1")
    @Positive(message = "페이지는 1 이상의 숫자이어야 합니다.")
    private Integer page = 1;

    @ApiParam(value = "페이지당 사이즈", defaultValue = "9")
    @Positive(message = "페이지당 사이즈는 1 이상의 숫자이어야 합니다.")
    private Integer pageSize = 9;

    @ApiParam(hidden = true)
    public int getOffset() { return (this.page - 1) * this.pageSize; }

    @ApiParam(hidden = true)
    public int getLimit() { return this.pageSize; }
}
