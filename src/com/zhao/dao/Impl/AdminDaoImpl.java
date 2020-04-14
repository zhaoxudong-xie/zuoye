package com.zhao.dao.Impl;

import com.zhao.dao.AdminDao;
import com.zhao.domain.Admin;
import com.zhao.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class AdminDaoImpl implements AdminDao {
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public Admin login(Admin admin) {
        Admin admin1=null;
        try{
            String sql="select*from t_admin where admin_name=? and password=?";
            admin1=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Admin>(Admin.class),admin.getAdminName(),admin.getPassword());
        }catch (Exception ex){
            throw ex;
        }
        return admin1;
    }
}

