package com.tpblog.sentinel.global;


import com.alibaba.csp.sentinel.slots.block.BlockException;

public class AccountHandler {
    public static String defaultException(BlockException e){
        return "handler-->系统繁忙，稍候再试";
    }
}
