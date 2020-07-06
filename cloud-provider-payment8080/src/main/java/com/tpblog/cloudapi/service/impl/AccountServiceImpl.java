package com.tpblog.cloudapi.service.impl;

import com.tpblog.cloudapi.entity.CloudAccount;
import com.tpblog.cloudapi.repository.AccountRepository;
import com.tpblog.cloudapi.service.AccountService;
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
