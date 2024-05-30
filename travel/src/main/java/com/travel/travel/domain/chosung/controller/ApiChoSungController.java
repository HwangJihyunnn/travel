package com.travel.travel.domain.chosung.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController @RequestMapping("/api/chosungs")
@Slf4j
public class ApiChoSungController {

    @GetMapping("")
    public String getChoSung(@RequestParam(value = "search", required = true) String search){
        log.info("search");
        return "test";
    }


}
