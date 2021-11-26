package com.crispycode.kcb.dto;

import com.crispycode.kcb.model.Comment;
import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MypageResponseDto {
    private Date commentDate;
    private Integer Rate;
    private String Content;
    private String SubjectType;
}
