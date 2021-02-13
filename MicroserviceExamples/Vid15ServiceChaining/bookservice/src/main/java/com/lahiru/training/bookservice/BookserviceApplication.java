package com.lahiru.training.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.lahiru.training.librarycloud.commons.model.book")
public class BookserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookserviceApplication.class, args);
    }

}
