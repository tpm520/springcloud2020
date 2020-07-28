package com.tpblog.cloudconsumerzookeeperorder8002.service;

import com.tpblog.cloudapi.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-provider-payment")
@Component
public interface AccountService {
    @GetMapping("/find/account/{aid}")
    public Result findAccountByAid(@PathVariable("aid") Integer aid);
}
