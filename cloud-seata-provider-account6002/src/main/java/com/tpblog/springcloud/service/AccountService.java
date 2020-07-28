package com.tpblog.springcloud.service;

import com.tpblog.cloudapi.entity.Account;

public interface AccountService {
    // 扣减账户余额
    Integer deduct(Account account);
}
