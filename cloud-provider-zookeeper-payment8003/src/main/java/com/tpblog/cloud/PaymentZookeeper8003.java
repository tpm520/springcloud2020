package com.tpblog.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan("com.tpblog.cloudapi.entity")
@EnableDiscoveryClient
public class PaymentZookeeper8003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeper8003.class,args);
    }
}
