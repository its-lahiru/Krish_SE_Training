package com.lahiru.training.studentservice.service;

import com.lahiru.training.librarycloud.commons.model.student.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student findStudentById(int id);

    List<Student> getAllStudents();

}
