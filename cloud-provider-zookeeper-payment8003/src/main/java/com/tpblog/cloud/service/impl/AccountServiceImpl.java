package com.tpblog.cloud.service.impl;

import com.tpblog.cloud.repository.AccountRepository;
import com.tpblog.cloud.service.AccountService;
import com.tpblog.cloudapi.entity.CloudAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public CloudAccount findAccountByAid(Integer aid) {

        return accountRepository.findByAid(aid);
    }
}
