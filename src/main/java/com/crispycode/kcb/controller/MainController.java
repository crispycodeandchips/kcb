package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.BeerResponseDto;
import com.crispycode.kcb.model.Beer;
import com.crispycode.kcb.model.BreweryEvent;
import com.crispycode.kcb.model.Goods;
import com.crispycode.kcb.service.BeerService;
import com.crispycode.kcb.service.EventService;
import io.swagger.annotations.ApiOperation;
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

    private final BeerService beerService;
    private final EventService eventService;

    @ApiOperation(value = "메인 페이지의 신상 맥주 정보", notes = "출시일 기준 가장 최근 릴리즈 된 맥주 5개")
    @GetMapping(value = "/beers")
    public ResponseEntity<List<Beer>> getBeerList(){

        return new ResponseEntity(beerService.getRecentList(), HttpStatus.OK);
    }

    @GetMapping(value = "/events")
    public ResponseEntity<List<BreweryEvent>> getEventList(){

        return new ResponseEntity(eventService.getRecentList(), HttpStatus.OK);
    }
}
