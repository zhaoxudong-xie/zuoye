package com.zhao.servlet;

import com.zhao.domain.Student;
import com.zhao.service.Impl.StudentServiceImpl;
import com.zhao.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listServlet")
public class ListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用service完成查询
        StudentService service=new StudentServiceImpl();
        List<Student>  students=service.findAll();
        //存放到request域中
        req.setAttribute("student",students);
        //转发到前台页面
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
