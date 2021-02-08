package com.example.configconsumer.controller;

import com.example.configconsumer.model.CustomerProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class ProfileController {
//
//    @Autowired
//    CustomerProfileConfiguration customerProfileConfiguration;
//
//    @RequestMapping(value = "/profile")
//    public CustomerProfileConfiguration getConfig(){
//        return customerProfileConfiguration;
//    }
//
//}

@Controller
public class ProfileController {

    @Autowired
    CustomerProfileConfiguration customerProfileConfiguration;

    @RequestMapping(value = "/profile")
    public String getConfig(Model model){
        model.addAttribute("item", customerProfileConfiguration.getDefaultItem());
        model.addAttribute("min", customerProfileConfiguration.getMinBuy());
        return "cProfile";
    }

}
