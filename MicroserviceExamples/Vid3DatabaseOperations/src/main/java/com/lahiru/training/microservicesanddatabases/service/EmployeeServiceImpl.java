package com.lahiru.training.microservicesanddatabases.service;

import com.lahiru.training.microservicesanddatabases.model.Employee;
import com.lahiru.training.microservicesanddatabases.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
