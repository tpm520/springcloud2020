package com.tpblog.cloudapi.controller;


import com.tpblog.cloudapi.entity.CloudAccount;
import com.tpblog.cloudapi.response.Result;
import com.tpblog.cloudapi.response.ResultCreate;
import com.tpblog.cloudapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/account/save")
    public Result saveAccount(@RequestBody CloudAccount cloudAccount){
        CloudAccount acc = accountService.saveAccount(cloudAccount);
        return ResultCreate.success(200,"success",acc);
    }

    @GetMapping("/account/find/{sid}")
    public Result findAccountByAid(@PathVariable("sid") Integer aid){

        return ResultCreate.success(200,"success",accountService.findAccountByAid(aid));
    }

}
