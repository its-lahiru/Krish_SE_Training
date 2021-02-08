package com.lahiru.training.microservicesanddatabases.repository;

import com.lahiru.training.microservicesanddatabases.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
