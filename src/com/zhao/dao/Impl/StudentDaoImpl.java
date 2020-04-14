package com.zhao.dao.Impl;



import com.zhao.dao.StudentDao;
import com.zhao.domain.Student;
import com.zhao.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class StudentDaoImpl implements StudentDao {
    JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public void addStudent(Student student) {
        String sql="insert into t_user(name,sex,age,stu_id,qq,email)values(?,?,?,?,?,?) ";
        jdbcTemplate.update(sql,student.getName(),student.getSex(),student.getAge(),student.getStuId(),student.getQQ(),student.getEmail());
    }

    @Override
    public List<Student> findAll() {
            String sql="select*from t_user";
            List<Student> students=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Student>(Student.class));
            return students;
    }
}
