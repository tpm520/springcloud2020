package com.tpblog.springcloud.repository;

import com.tpblog.cloudapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
