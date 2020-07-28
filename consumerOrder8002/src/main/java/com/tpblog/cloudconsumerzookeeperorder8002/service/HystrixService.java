package com.tpblog.cloudconsumerzookeeperorder8002.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-provider-hystrix-payment",fallback = HystrixFallBackServiceImpl.class)
public interface HystrixService {
    @RequestMapping("/get_ok")
    public String get_ok();

    @RequestMapping("/get_error")
    public String get_error();
}
