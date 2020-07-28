package com.tpblog.cloud.service;

import com.tpblog.cloudapi.entity.CloudAccount;

public interface AccountService {
    CloudAccount findAccountByAid(Integer aid);
}
