package com.tpblog.cloudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PaymentApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8080.class,args);
    }
}
