package com.czxt.web;

import com.alibaba.fastjson.JSON;
import com.czxt.bean.ResultInfo;
import com.czxt.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class getLoginUserServlet {
    @WebServlet("/getLoginUserServlet")
    public class GetLoginUserServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            //1、接收请求数据


            //2、处理数据：从session中获取用户数据
            User loginUser = (User) request.getSession().getAttribute("loginUser");
            ResultInfo resultInfo = new ResultInfo();

            if (loginUser == null) {
                //从session中没有获取到数据：未登录
                resultInfo.setFlag(false);
            }else{
                //已登录
                resultInfo.setFlag(true);
                String username = loginUser.getUsername();
                resultInfo.setData(username);
            }


            //3、响应数据
            String s = JSON.toJSONString(resultInfo);
            response.getWriter().print(s);

        }
    }

}
