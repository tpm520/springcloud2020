package com.tpblog.springcloud.service;

import com.tpblog.cloudapi.entity.Storage;
import com.tpblog.cloudapi.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("cloud-seata-provider-storage")
public interface StorageService {
    @PostMapping("/storage/deduct")
    public Result deductStorage(@RequestBody Storage storage);
}
