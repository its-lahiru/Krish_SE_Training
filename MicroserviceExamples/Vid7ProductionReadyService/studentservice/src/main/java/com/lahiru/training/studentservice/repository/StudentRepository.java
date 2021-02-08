package com.lahiru.training.studentservice.repository;

import com.lahiru.training.librarycloud.commons.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
