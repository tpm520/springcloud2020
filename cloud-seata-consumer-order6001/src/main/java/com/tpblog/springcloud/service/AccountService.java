package com.tpblog.springcloud.service;

import com.tpblog.cloudapi.entity.Account;
import com.tpblog.cloudapi.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("cloud-seata-provider-account")
public interface AccountService {
    @PostMapping("/account/deduct")
    public Result deduct(@RequestBody Account account);


}
