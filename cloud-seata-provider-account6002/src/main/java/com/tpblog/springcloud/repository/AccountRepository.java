package com.tpblog.springcloud.repository;

import com.tpblog.cloudapi.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface AccountRepository extends JpaRepository<Account,Long> {

    @Query(value = "UPDATE Account SET money=money-?1 WHERE uid=?2")
    @Modifying
    @Transactional
    public Integer deduct(Integer money,Integer uid);
}
