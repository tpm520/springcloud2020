package com.tpblog.cloudapi.controller;

import com.tpblog.cloudapi.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/order/account/find/{aid}")
    public Result findAccountByAid(@PathVariable("aid") Integer aid){

        return null;
    }
}
