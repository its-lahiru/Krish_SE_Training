package com.lahiru.training.lendingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.lahiru.training.librarycloud.commons.model.lend")
@EnableEurekaClient
@EnableCircuitBreaker
public class LendingserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LendingserviceApplication.class, args);
    }

}
