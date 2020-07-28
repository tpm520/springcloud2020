package com.tpblog.springcloud.service;


import com.tpblog.cloudapi.entity.Order;

public interface OrderService {
    Order saveOrder(Order order);

    void orderShop(Order order);
}
