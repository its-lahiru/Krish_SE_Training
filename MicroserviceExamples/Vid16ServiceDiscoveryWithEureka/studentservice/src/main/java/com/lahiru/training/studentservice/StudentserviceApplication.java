package com.lahiru.training.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.lahiru.training.librarycloud.commons.model.student")
@EnableEurekaClient
public class StudentserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentserviceApplication.class, args);
    }

}
