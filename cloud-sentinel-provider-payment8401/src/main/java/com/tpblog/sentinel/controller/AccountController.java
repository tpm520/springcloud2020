package com.tpblog.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.tpblog.sentinel.global.AccountFallback;
import com.tpblog.sentinel.global.AccountHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/testA")
    public String testA(){
        return "testA";
    }

    @GetMapping("/testB")
    @SentinelResource(value = "testB",blockHandler = "handler")
    public String testB(@RequestParam(value = "p1",required = false) String p1,@RequestParam(value = "p2",required = false) String p2){
        return "testB";
    }
    public String handler(String p1, String p2, BlockException block){
        return "handler->服务繁忙";
    }

    @GetMapping("/testC")
    @SentinelResource(value = "testC",
            blockHandlerClass = AccountHandler.class,
            blockHandler = "defaultException"
            )
    public String testC(){
        return "testC";
    }


    @GetMapping("/testD")
    @SentinelResource(value = "testD",
            fallbackClass = AccountFallback.class,
            fallback = "defaultException"
            //blockHandler = "handler1"
            //exceptionsToIgnore = {RuntimeException.class}
    )
    public String testD(){
        int i = 1/0;
        return "testD";
    }
    public String handler1( BlockException block){
        return "handler->服务繁忙："+block.getMessage();
    }
    public String exce(Throwable e){
        return "fallback---出错了："+e.getMessage();
    }
}
