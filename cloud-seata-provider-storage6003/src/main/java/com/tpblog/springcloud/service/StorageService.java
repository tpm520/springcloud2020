package com.tpblog.springcloud.service;

import com.tpblog.cloudapi.entity.Storage;

public interface StorageService {
    Integer deductStorage(Storage storage);
}
