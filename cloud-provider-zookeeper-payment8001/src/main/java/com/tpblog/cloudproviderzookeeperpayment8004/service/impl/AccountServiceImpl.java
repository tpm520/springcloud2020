package com.tpblog.cloudproviderzookeeperpayment8004.service.impl;

import com.tpblog.cloudapi.entity.CloudAccount;
import com.tpblog.cloudproviderzookeeperpayment8004.repository.AccountRepository;
import com.tpblog.cloudproviderzookeeperpayment8004.service.AccountService;
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
