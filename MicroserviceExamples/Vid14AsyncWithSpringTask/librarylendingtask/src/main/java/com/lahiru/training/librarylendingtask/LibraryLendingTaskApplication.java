package com.lahiru.training.librarylendingtask;

import com.lahiru.training.librarylendingtask.service.LibraryLendingTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class LibraryLendingTaskApplication {

    @Bean
    LibraryLendingTaskRunner getLibraryLendingTaskRunner(){
        return new LibraryLendingTaskRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryLendingTaskApplication.class, args);
    }

}
