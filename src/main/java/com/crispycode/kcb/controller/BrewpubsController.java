package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.*;
import com.crispycode.kcb.model.Brewpub;
import com.crispycode.kcb.service.BreweryService;
import com.crispycode.kcb.service.BrewpubService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/brewpubs")
public class BrewpubsController {
        private final BrewpubService brewpubService;

    @GetMapping
    public ResponseEntity<BrewpubMapResponseDto> getBrewpubMap() {
        return new ResponseEntity(brewpubService.getMap(),HttpStatus.OK);
    }

        @GetMapping("/{id}")
        public ResponseEntity<Brewpub> getBrewpub(@PathVariable Integer id){
            return new ResponseEntity(brewpubService.getBrewpub(id), HttpStatus.OK);
        }
/*
        @GetMapping("/{id}/dishes")
        public ResponseEntity<BreweryEventResponseDto> getBreweryEvent(@PathVariable Integer id){
            return new ResponseEntity(breweryService.getEvents(id), HttpStatus.OK);
        }
*/
}
