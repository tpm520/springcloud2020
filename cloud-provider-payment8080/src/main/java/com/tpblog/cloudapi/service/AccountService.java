package com.tpblog.cloudapi.service;


import com.tpblog.cloudapi.entity.CloudAccount;

public interface AccountService {
    CloudAccount saveAccount(CloudAccount account);

    CloudAccount findAccountByAid(Integer aid);
}
