package com.tpblog.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8008 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8008.class,args);
    }
}
