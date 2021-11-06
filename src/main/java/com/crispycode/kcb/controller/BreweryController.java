package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.BreweryEventResponseDto;
import com.crispycode.kcb.dto.BreweryLineupResponseDto;
import com.crispycode.kcb.model.Brewery;
import com.crispycode.kcb.service.BreweryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/brewery")
public class BreweryController {
    private final BreweryService breweryService;

    @GetMapping("/{id}/lineup")
    public ResponseEntity<BreweryLineupResponseDto> getBreweryLineup(@PathVariable Integer id){
        // ResponseEntity로 안 감싸면 그냥 단순히 DTO만 던지는 것.
        // ResponseEnity로 감싸야 200, 400, 404 같은 status를 포함해서 값을 보낼 수 있다.
        return new ResponseEntity(breweryService.getLineup(id), HttpStatus.OK);
    }

    @GetMapping("/{id}/events")
    public ResponseEntity<BreweryEventResponseDto> getBreweryEvent(@PathVariable Integer id){
        return new ResponseEntity(breweryService.getEvents(id), HttpStatus.OK);
    }
}
