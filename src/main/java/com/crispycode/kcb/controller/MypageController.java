package com.crispycode.kcb.controller;

import com.crispycode.kcb.dto.BreweryMapResponseDto;
import com.crispycode.kcb.dto.MypageResponseDto;
import com.crispycode.kcb.service.MypageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/mypages")
public class MypageController {
    private final MypageService mypageService;

    @GetMapping("/{writer}")
    public ResponseEntity<List<MypageResponseDto>> getMypageList(@PathVariable("writer") String writer){

        return new ResponseEntity(mypageService.getList(writer), HttpStatus.OK);
    }
}
