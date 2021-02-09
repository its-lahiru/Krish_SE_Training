package com.lahiru.training.studentservice.controller;

import com.lahiru.training.librarycloud.commons.model.Student;
import com.lahiru.training.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student findStudentById(@RequestParam int id){
        return studentService.findStudentById(id);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
