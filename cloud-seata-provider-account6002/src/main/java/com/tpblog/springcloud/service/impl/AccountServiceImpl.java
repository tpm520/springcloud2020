package com.tpblog.springcloud.service.impl;

import com.tpblog.cloudapi.entity.Account;
import com.tpblog.springcloud.repository.AccountRepository;
import com.tpblog.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Integer deduct(Account account) {
        Integer info = accountRepository.deduct(account.getMoney(),account.getUid());

        return info;
    }
}
