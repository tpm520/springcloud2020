package com.tpblog.springcloud.repository;

import com.tpblog.cloudapi.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface StorageRepository extends JpaRepository<Storage,Long> {

    @Query(value = "UPDATE Storage SET num=num-?1 WHERE commodity_code=?2")
    @Modifying
    @Transactional
    public Integer deductStorage(Integer num,Integer codeId);


}
