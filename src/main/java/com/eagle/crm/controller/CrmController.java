package com.eagle.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "")
@SuppressWarnings("unused")
public class CrmController {
    @GetMapping(value = {"/main","/main.html"})
    public String mainPage(){
        return "main";
    }
}
