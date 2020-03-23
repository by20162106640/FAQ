package com.czxt.web;

import com.alibaba.fastjson.JSON;
import com.czxt.bean.ResultInfo;
import com.czxt.bean.User;
import com.czxt.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/zcServelet")
public class zcServelet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、接收请求数据： Alt+Enter
        Map<String, String[]> map = request.getParameterMap();
        //封装数据
        User user = new User();
        String zcJson;
        try {
            BeanUtils.populate(user,map);
            //2、处理数据：注册
            UserService userService = new UserService ();

            zcJson = userService.zc(user);

        } catch (Exception e) {
            e.printStackTrace();
            //处理异常的结果
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setFlag(false);
            resultInfo.setErrorMsg("数据异常，请联系管理员！");
            zcJson = JSON.toJSONString(resultInfo);
        }
        //3、响应数据
        response.getWriter().print(zcJson);
    }
}

