package com.lahiru.training.lendingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.lahiru.training.librarycloud.commons.model.lend")
public class LendingserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LendingserviceApplication.class, args);
    }

}
