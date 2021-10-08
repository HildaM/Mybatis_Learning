package com.quan.dao;

import com.quan.pojo.User;

import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @Description: 作为对比
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/8 19:34
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getUserList() {
        // 链接数据库
        // 执行SQL
        String sql = "select * from mybatis_quan.user";
        // 获得结果集 ResultSet

        return null;
    }
}
