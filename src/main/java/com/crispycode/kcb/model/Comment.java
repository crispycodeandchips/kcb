package com.crispycode.kcb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Integer commentId;
    private Date commentDate;
    private String content;
    private Integer rate;
    private String subjectType;
    private Integer subjectId;
}
