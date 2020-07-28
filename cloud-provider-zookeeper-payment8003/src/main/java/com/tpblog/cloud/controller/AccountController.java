package com.tpblog.cloud.controller;

import com.tpblog.cloud.service.AccountService;
import com.tpblog.cloudapi.response.Result;
import com.tpblog.cloudapi.response.ResultCreate;
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

        return ResultCreate.success(200,"success+8003",accountService.findAccountByAid(aid));
    }
}
