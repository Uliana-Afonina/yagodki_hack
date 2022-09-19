package com.afoninauliana.springboot.yagodki_hack.controller;

import com.afoninauliana.springboot.yagodki_hack.service.impl.TempService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private TempService tempService;

    @GetMapping(value = "/")
    public void go() {
        tempService.justDoIt();
    }

}
