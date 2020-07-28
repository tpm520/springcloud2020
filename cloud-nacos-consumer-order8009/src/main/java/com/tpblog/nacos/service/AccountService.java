package com.tpblog.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cloud-provider-payment")
@Component
public interface AccountService {
    @GetMapping("/getMessage")
    public String getMessage();
}
