package com.tpblog.cloudproviderzookeeperpayment8004.controller;

import com.tpblog.cloudapi.response.Result;
import com.tpblog.cloudapi.response.ResultCreate;
import com.tpblog.cloudproviderzookeeperpayment8004.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/find/account/{aid}")
    public Result findAccountByAid(@PathVariable("aid") Integer aid){

        return ResultCreate.success(200,"success",accountService.findAccountByAid(aid));
    }
}
