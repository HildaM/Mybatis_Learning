package com.quan.dao;

import com.quan.pojo.User;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: UserDao接口，用以操作数据库
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/8 19:21
 */
public interface UserDao {
    List<User> getUserList();
}
