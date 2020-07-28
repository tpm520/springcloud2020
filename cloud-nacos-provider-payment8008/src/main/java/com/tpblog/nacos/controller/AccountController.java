package com.tpblog.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Value("${spring.datasource.url}")
    private String serverPort;


    @GetMapping("/getMessage")
    public String getMessage(){
        return "success--port="+serverPort;
    }
}
