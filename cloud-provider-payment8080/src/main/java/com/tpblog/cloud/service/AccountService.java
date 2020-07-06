package com.tpblog.cloud.service;

import com.tpblog.cloud.entity.CloudAccount;

public interface AccountService {
    CloudAccount saveAccount(CloudAccount account);

    CloudAccount findAccountByAid(Integer aid);
}
