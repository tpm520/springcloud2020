package com.tpblog.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8401 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8401.class,args);
    }
}
