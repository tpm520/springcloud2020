package com.tpblog.cloud.controller;

import com.tpblog.cloud.entity.CloudAccount;
import com.tpblog.cloud.response.Result;
import com.tpblog.cloud.response.ResultCreate;
import com.tpblog.cloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

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
