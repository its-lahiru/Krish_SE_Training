package com.lahiru.training.microservicesanddatabases.controller;

import com.lahiru.training.microservicesanddatabases.model.Employee;
import com.lahiru.training.microservicesanddatabases.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    EmployeeService employeeService;

    // Best practice
    // Do not use verbs in endpoint
    // addStudent, updateStudent etc
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

}
