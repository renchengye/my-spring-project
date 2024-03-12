package com.yerencheng.studentclient.rest;

import com.yerencheng.studentclient.model.Student;
import com.yerencheng.studentclient.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    final Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentService studentService;

    @GetMapping("")
    public String index() {
        return "Welcome to Student View!";
    }

    @GetMapping("/error")
    public  String error() throws Exception {
        throw new Exception("Sam 错误");
    }

    @PostMapping("/addNewStudent")
    public void addNewStudent(@RequestParam String name,
                              @RequestParam String gender,
                              @RequestParam Integer age) {
        Student student = new Student(name, gender, age);
        studentService.addNewStudent(student);
    }

    @GetMapping("/listAllStudents")
    public List listAllStudents() {
        return studentService.listAllStudents();
    }

}
