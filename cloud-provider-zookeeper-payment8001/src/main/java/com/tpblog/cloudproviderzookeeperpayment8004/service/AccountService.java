package com.tpblog.cloudproviderzookeeperpayment8004.service;

import com.tpblog.cloudapi.entity.CloudAccount;

public interface AccountService {
    CloudAccount findAccountByAid(Integer aid);
}
