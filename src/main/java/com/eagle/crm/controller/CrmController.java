package com.eagle.crm.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CrmController {
    @GetMapping(value = {"/main","/main.html"})
    public String main(){
        return "main";
    }
}
