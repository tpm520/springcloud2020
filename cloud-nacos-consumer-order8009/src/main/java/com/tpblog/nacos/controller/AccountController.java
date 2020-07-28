package com.tpblog.nacos.controller;

import com.tpblog.nacos.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/getMessage")
    public String getMessage(){
        return accountService.getMessage();
    }
}
