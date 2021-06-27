package com.eagle.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RequestMapping(value = "")
@SuppressWarnings("unused")
public class CrmController {
    @GetMapping(value = {"/main","/main.html"})
    public String mainPage(){
        return "main";
    }
    @GetMapping(value = {"/on.html"})
    public String onPage(){
        return "on";
    }
}
