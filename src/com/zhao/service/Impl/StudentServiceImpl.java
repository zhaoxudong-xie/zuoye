package com.zhao.service.Impl;

import com.zhao.dao.Impl.StudentDaoImpl;
import com.zhao.dao.StudentDao;
import com.zhao.domain.Student;
import com.zhao.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao=new StudentDaoImpl();
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
