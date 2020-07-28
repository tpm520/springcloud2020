package com.tpblog.springcloud.controller;

import com.tpblog.cloudapi.entity.Account;
import com.tpblog.cloudapi.entity.Order;
import com.tpblog.cloudapi.entity.Storage;
import com.tpblog.cloudapi.response.Result;
import com.tpblog.cloudapi.response.ResultCreate;
import com.tpblog.springcloud.service.AccountService;
import com.tpblog.springcloud.service.OrderService;
import com.tpblog.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private StorageService storageService;

    @Autowired
    private OrderService orderService;

    @PostMapping("/account/deduct")
    public Result deductAccount(@RequestBody Account account){
        Result result = accountService.deduct(account);
        return result;
    }

    @PostMapping("/storage/deduct")
    public Result deductStorage(@RequestBody Storage storage){
        Result result = storageService.deductStorage(storage);
        return result;
    }

    @PostMapping("/order/save")
    public Result saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
        return ResultCreate.success(200,"success",order);
    }

    @PostMapping("/order/shop")

    public Result orderShop(@RequestBody Order order){

        orderService.orderShop(order);

        return ResultCreate.success(200,"success",1);
    }

}
