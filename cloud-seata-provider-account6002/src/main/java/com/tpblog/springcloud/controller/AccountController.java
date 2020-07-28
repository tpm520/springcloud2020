package com.tpblog.springcloud.controller;


import com.tpblog.cloudapi.entity.Account;
import com.tpblog.cloudapi.response.Result;
import com.tpblog.cloudapi.response.ResultCreate;
import com.tpblog.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/account/deduct")
    public Result deduct(@RequestBody Account account){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Integer account1 = accountService.deduct(account);

        return ResultCreate.success(200,"success",account1);
    }

}
