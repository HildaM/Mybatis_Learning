package com.quan.dao;

import com.quan.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserMapper
 * @Description: UserDao接口，用以操作数据库
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/8 19:21
 */
public interface UserMapper {

    // 根据id查询用户
    User getUserById(int id);

    // 分页实现查询
    List<User> getUserByLimit(Map<String, Integer> map);

    // 分页实现查询
    List<User> getUserByRowBounds();

}
