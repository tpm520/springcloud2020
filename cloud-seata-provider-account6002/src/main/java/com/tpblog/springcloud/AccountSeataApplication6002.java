package com.tpblog.springcloud;

import io.seata.config.springcloud.EnableSeataSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories
@EntityScan("com.tpblog.cloudapi.entity")
public class AccountSeataApplication6002 {
    public static void main(String[] args) {
        SpringApplication.run(AccountSeataApplication6002.class,args);
    }
}
