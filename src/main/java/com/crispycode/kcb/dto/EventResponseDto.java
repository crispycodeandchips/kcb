package com.crispycode.kcb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventResponseDto {

    private String eventName;
    private Date startDate;
    private Date endDate;
    private String image;

    private List<EventResponseDto> Events;

}
