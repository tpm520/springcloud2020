package com.tpblog.controller;


import com.tpblog.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/get_ok")
    public String get_ok(){
        return accountService.get_ok();
    }

    @RequestMapping("/get_error")
    public String get_error(){

        return accountService.get_error();
    }

}
