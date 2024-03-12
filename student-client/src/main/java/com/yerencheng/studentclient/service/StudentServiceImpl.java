package com.yerencheng.studentclient.service;

import com.yerencheng.studentclient.dao.StudentRepository;
import com.yerencheng.studentclient.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void addNewStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    @Override
    public List<Student> listAllStudents() {
        return studentRepository.findAll();
    }

}
