package com.tpblog.cloud.service.impl;

import com.tpblog.cloud.entity.CloudAccount;
import com.tpblog.cloud.repository.AccountRepository;
import com.tpblog.cloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public CloudAccount saveAccount(CloudAccount account) {
        CloudAccount cloudAccount = repository.save(account);
        System.out.println(cloudAccount);
        return cloudAccount;
    }

    @Override
    public CloudAccount findAccountByAid(Integer aid) {
        CloudAccount cloudAccount = repository.findByAid(aid);
        return cloudAccount;
    }
}
