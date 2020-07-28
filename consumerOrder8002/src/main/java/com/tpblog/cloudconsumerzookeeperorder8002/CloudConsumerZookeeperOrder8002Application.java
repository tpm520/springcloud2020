package com.tpblog.cloudconsumerzookeeperorder8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class CloudConsumerZookeeperOrder8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerZookeeperOrder8002Application.class, args);
    }

}
