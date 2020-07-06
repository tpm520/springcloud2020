package com.tpblog.cloud.repository;

import com.tpblog.cloud.entity.CloudAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<CloudAccount,Long> {

    CloudAccount findByAid(Integer aid);

}
