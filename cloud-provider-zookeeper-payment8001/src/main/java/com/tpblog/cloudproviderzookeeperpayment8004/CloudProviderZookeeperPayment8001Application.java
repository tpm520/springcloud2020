package com.tpblog.cloudproviderzookeeperpayment8004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EntityScan("com.tpblog.cloudapi.entity")
public class CloudProviderZookeeperPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderZookeeperPayment8001Application.class, args);
    }

}
