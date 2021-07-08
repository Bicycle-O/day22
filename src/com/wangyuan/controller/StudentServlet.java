package com.wangyuan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wangyuan.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Tom", 19));
        list.add(new Student(2, "Lucy", 20));
        list.add(new Student(3, "LiangzhiChao", 22));

        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(list);
        PrintWriter pw = resp.getWriter();
        pw.print(res);
        pw.close();
    }
}
