package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.dto.EventResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/main")
public class MainController {

    @GetMapping(value = "/beers")
    public ResponseEntity<List<BeerResponseDto>> getMainBeers() {

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/events")
    public ResponseEntity<EventResponseDto> getMainEvents() {

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
