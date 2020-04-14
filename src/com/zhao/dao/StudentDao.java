package com.zhao.dao;

import com.zhao.domain.Student;

import java.util.List;

public interface StudentDao {
    void addStudent(Student student);

    List<Student> findAll();
}
