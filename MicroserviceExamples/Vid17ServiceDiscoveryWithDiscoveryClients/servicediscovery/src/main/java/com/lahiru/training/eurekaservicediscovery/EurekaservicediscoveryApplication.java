package com.lahiru.training.eurekaservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaservicediscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaservicediscoveryApplication.class, args);
    }

}
