package com.tpblog.springcloud.controller;


import com.tpblog.cloudapi.entity.Storage;
import com.tpblog.cloudapi.response.Result;
import com.tpblog.cloudapi.response.ResultCreate;
import com.tpblog.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/storage/deduct")
    public Result deductStorage(@RequestBody Storage storage){

        Integer info = storageService.deductStorage(storage);

        return ResultCreate.success(200,"success",info);
    }
}
