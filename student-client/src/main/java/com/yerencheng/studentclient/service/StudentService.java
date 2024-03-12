package com.yerencheng.studentclient.service;

import com.yerencheng.studentclient.model.Student;

import java.util.List;

public interface StudentService {

    void addNewStudent(Student newStudent);

    List<Student> listAllStudents();

}
