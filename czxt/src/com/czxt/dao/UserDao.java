package com.czxt.dao;

import com.czxt.bean.User;
import com.czxt.utils.C3p0Utils;
import com.czxt.utils.UuidUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
public class UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(C3p0Utils.getDataSource());

    /**
     * 查询所有数据
     * @return
     */
    public List<User> queryAll() {

        //1、初始化JdbcTemplate模板：创建JdbcTemplate对象
        //2、写sql
        String sql = "SELECT * FROM user";
        //3、执行sql，返回值 List-集合
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));

        return userList;
    }


    /**
     * 添加数据
     * @param user
     * @return
     */
    public int addUser(User user) {

        //写SQL：
        String sql = "INSERT INTO user VALUES(NULL,?,?,?,?,?,?,?,?,?)";
        //执行SQL：
        int update = jdbcTemplate.update(sql,
                user.getUsername(),
                user.getPassword(),
                user.getName(),
                user.getBirthday(),
                user.getTelephone(),
                user.getEmail(),
                UuidUtil.getUuid());
        return update;
    }
}
