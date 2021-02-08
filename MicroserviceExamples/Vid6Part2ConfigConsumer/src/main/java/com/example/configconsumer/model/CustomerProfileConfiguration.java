package com.example.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CustomerProfileConfiguration {

    @Autowired
    Environment environment;

    public String getDefaultItem(){
        return environment.getProperty("product.default.item");
    }

    public String getMinBuy(){
        return environment.getProperty("customer.buy.min");
    }

}
