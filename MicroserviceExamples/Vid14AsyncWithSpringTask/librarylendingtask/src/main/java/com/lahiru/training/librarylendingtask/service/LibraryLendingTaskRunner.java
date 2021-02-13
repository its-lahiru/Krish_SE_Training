package com.lahiru.training.librarylendingtask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class LibraryLendingTaskRunner implements CommandLineRunner {

    @Autowired
    LibraryLendingService libraryLendingService;

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0){
            System.out.println("Task running with args");
            if (libraryLendingService.validName(args[0])){
                System.out.println("Valid name");
            } else {
                System.out.println("Invalid name");
            }
        } else {
            System.out.println("Task running without args");
        }
    }

}
