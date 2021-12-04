package com.crispycode.kcb.service;

import com.crispycode.kcb.mapper.EventMapper;
import com.crispycode.kcb.model.BreweryEvent;
import com.crispycode.kcb.model.Vo;
import com.crispycode.kcb.model.VoTest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventMapper eventMapper;

    public List<BreweryEvent> getRecentList(){

        return eventMapper.selectRecentEvents();
    }

    public void saveImage(Vo vo) {
        byte[] bytes = new byte[0];
        try {
            bytes = vo.getImgFile().getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        eventMapper.insertImage(
                VoTest.builder().id(vo.getId()).bytes(new ByteArrayInputStream(bytes)).build());
    }
}
