package com.tpblog.cloudproviderzookeeperpayment8004.repository;

import com.tpblog.cloudapi.entity.CloudAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<CloudAccount,Long> {
    CloudAccount findByAid(Integer aid);
}
