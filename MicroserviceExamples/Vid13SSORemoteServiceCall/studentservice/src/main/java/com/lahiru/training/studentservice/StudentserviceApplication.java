package com.lahiru.training.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan(basePackages = "com.lahiru.training.librarycloud.commons.model")
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class StudentserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentserviceApplication.class, args);
    }

}
