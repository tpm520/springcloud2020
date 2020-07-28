package com.tpblog.cloudconsumerzookeeperorder8002.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.tpblog.cloudapi.response.Result;
import com.tpblog.cloudapi.response.ResultCreate;
import com.tpblog.cloudconsumerzookeeperorder8002.service.AccountService;
import com.tpblog.cloudconsumerzookeeperorder8002.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@DefaultProperties(defaultFallback = "defaultFall")
public class AccountController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AccountService accountService;

    @Autowired
    private HystrixService hystrixService;

    private static final String url = "http://cloud-provider-payment";

    @GetMapping("/find/account/{aid}")
    public Result findAccountByAid(@PathVariable("aid") Integer aid){

        Result account = restTemplate.getForObject(url+"/find/account/"+aid,Result.class);

        return ResultCreate.success(200,account.getMessage(),account.getData());
    }

    @GetMapping("/find2/account/{aid}")
    public Result findAccountByAid2(@PathVariable("aid") Integer aid){

        Result account = accountService.findAccountByAid(aid);

        return ResultCreate.success(200,account.getMessage(),account.getData());
    }

    @GetMapping("/get_ok")
    public String get_ok(){
        return hystrixService.get_ok();
    }

    @GetMapping("/get_error")
    /*@HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })*/
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000"),
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String get_error(){
        return hystrixService.get_error();
    }

    private String ok(){
        return "系统太忙啦";
    }

    private String defaultFall(){
        return "default_服务忙";
    }

}
