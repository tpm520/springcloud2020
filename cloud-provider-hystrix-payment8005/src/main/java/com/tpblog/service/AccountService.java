package com.tpblog.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.TimeUnit;

@Service
public class AccountService {


    public String get_ok(){
        return "success："+Thread.currentThread().getName();
    }

    @HystrixCommand(fallbackMethod = "ok",commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String get_error(){
        long wait = 3;
        try {
            TimeUnit.SECONDS.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "wait："+Thread.currentThread().getName();
    }

    private String ok(){
        return "服务繁忙，稍候再试";
    }
}
