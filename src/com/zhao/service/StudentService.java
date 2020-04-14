package com.zhao.service;

import com.zhao.domain.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    List<Student> findAll();
}
