package com.lahiru.training.demoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World! from GET method";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String helloWorld2(){
        return "Hello World! from POST method";
    }

}
