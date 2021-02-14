package com.lahiru.training.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.lahiru.training.librarycloud.commons.model.book")
@EnableEurekaClient
public class BookserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookserviceApplication.class, args);
    }

}
