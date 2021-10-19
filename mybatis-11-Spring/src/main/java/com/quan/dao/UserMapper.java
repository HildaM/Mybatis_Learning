package com.quan.dao;

import com.quan.pojo.User;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/19 20:17
 */
public interface UserMapper {
    List<User> selectUser();
}
