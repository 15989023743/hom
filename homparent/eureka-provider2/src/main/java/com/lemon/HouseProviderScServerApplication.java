package com.lemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HouseProviderScServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HouseProviderScServerApplication.class, args);
    }
}
