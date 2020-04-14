package com.zhao.service.Impl;

import com.zhao.dao.AdminDao;
import com.zhao.dao.Impl.AdminDaoImpl;
import com.zhao.domain.Admin;
import com.zhao.service.AdminService;

public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao=new AdminDaoImpl();


    @Override
    public boolean login(Admin admin) {
        Admin admin1=adminDao.login(admin);
        if(admin1!=null){
            return true;
        }else{
            return false;
        }
    }
}
