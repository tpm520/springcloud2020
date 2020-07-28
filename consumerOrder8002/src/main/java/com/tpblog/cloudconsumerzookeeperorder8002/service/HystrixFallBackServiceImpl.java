package com.tpblog.cloudconsumerzookeeperorder8002.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixFallBackServiceImpl implements HystrixService {
    @Override
    public String get_ok() {
        return "服务出问题啦。。。";
    }

    @Override
    public String get_error() {
        return "忙死啦忙死啦";
    }
}
