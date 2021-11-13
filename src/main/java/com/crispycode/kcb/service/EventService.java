package com.crispycode.kcb.service;

import com.crispycode.kcb.mapper.EventMapper;
import com.crispycode.kcb.model.BreweryEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventMapper eventMapper;

    public List<BreweryEvent> getRecentList(){
        return eventMapper.selectRecentEvents();
    }
}
