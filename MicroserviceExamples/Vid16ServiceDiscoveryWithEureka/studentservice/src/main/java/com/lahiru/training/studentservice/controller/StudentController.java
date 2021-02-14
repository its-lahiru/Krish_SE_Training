package com.lahiru.training.studentservice.controller;

import com.lahiru.training.librarycloud.commons.model.student.Student;
import com.lahiru.training.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Student findStudentById(@PathVariable(value = "id") int studentId){
        return studentService.findStudentById(studentId);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
