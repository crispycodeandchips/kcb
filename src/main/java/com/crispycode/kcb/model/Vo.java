package com.crispycode.kcb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class Vo {
    private Integer id;

    private MultipartFile imgFile;
}
