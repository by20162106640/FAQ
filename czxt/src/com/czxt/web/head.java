package com.czxt.web;

import com.alibaba.fastjson.JSON;
import com.czxt.bean.ResultInfo;
import com.czxt.bean.User;
import com.czxt.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/headServlet")
public class head extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//获取类型
        String type=request.getParameter("type");
        System.out.println(type);
//判断类型
        if("2".equals(type)){
            request.getRequestDispatcher("/manager.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/common.jsp").forward(request, response);
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
