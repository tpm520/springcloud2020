package com.tpblog.springcloud.service.impl;

import com.tpblog.cloudapi.entity.Account;
import com.tpblog.cloudapi.entity.Order;
import com.tpblog.cloudapi.entity.Storage;
import com.tpblog.springcloud.repository.OrderRepository;
import com.tpblog.springcloud.service.AccountService;
import com.tpblog.springcloud.service.OrderService;
import com.tpblog.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private AccountService accountService;

    @Autowired
    private StorageService storageService;


    @Override
    public Order saveOrder(Order order) {
        orderRepository.save(order);
        return order;
    }

    @Override
    @GlobalTransactional
    @Transactional(rollbackOn = Exception.class)
    public void orderShop(Order order){
        log.info("保存订单-start");
        saveOrder(order);
        log.info("保存订单-end");

        log.info("扣减余额-start");
        Account account = new Account();
        account.setMoney(order.getMoney());
        account.setUid(order.getUid());
        System.out.println(account);
        accountService.deduct(account);
        log.info("扣减余额-end");

        log.info("扣减库存-start");
        Storage storage = new Storage();
        storage.setCommodity_code(order.getCommodity_code());
        storage.setNum(order.getCount());
        storageService.deductStorage(storage);
        log.info("扣减库存-end");

    }
}
