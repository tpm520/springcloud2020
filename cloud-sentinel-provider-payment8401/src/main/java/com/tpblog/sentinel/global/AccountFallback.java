package com.tpblog.sentinel.global;

import org.springframework.stereotype.Component;

public class AccountFallback {
    public static String defaultException(){
        return "fallback-->系统繁忙，稍候再试";
    }
}
