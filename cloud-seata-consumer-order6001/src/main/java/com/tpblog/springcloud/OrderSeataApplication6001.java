package com.tpblog.springcloud;

import io.seata.config.springcloud.EnableSeataSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EntityScan("com.tpblog.cloudapi.entity")
public class OrderSeataApplication6001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderSeataApplication6001.class,args);
    }
}
