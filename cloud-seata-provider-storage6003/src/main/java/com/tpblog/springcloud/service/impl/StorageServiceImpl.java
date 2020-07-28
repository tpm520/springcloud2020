package com.tpblog.springcloud.service.impl;

import com.tpblog.cloudapi.entity.Storage;
import com.tpblog.springcloud.repository.StorageRepository;
import com.tpblog.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageRepository storageRepository;

    @Override
    public Integer deductStorage(Storage storage) {
        return storageRepository.deductStorage(storage.getNum(),storage.getCommodity_code());
    }
}
