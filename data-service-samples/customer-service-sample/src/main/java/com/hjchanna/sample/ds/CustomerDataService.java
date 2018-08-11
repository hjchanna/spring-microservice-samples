package com.hjchanna.sample.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerDataService {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDataService.class, args);
    }
}
