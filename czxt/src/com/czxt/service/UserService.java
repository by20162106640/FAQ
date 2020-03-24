package com.czxt.service;

import com.alibaba.fastjson.JSON;
import com.czxt.bean.User;
import com.czxt.bean.ResultInfo;
import com.czxt.dao.UserDao;

import java.util.List;

public class UserService {
    UserDao UserDao = new UserDao();
    public String queryAll() {
        //查询数据：调用dao层查询数据
        List<User> userList =  UserDao.queryAll();

        //userList  ===>  JSON String
        String s = JSON.toJSONString(userList);

        return s;

    }


    /**
     * 处理注册业务的方法
     * @param user
     * @return
     */
    public String register(User user) {
        //0：添加了0条数据--添加失败    1：添加成功
        int addFlag =  UserDao.addUser(user);

        //封装结果
        ResultInfo resultInfo = new ResultInfo();
        if (addFlag == 0) {
            resultInfo.setFlag(false);
        }else{
            resultInfo.setFlag(true);
        }

        String s = JSON.toJSONString(resultInfo);

        return s;
    }
}
