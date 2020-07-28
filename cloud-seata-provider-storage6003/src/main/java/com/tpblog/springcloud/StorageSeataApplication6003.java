package com.tpblog.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories
@EntityScan("com.tpblog.cloudapi.entity")
public class StorageSeataApplication6003 {
    public static void main(String[] args) {
        SpringApplication.run(StorageSeataApplication6003.class,args);
    }
}
