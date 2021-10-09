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
    // 查询全部用户
    List<User> getUserList();

    // 根据id查询用户
    User getUserById(int id);

    User getUserById2(Map<String, Object> map);

    // 模糊查询
    List<User> getUserLike(String value);

    // insert 增加用户
    int addUser(User user);

    // 使用 map 实现add
    int addUser2(Map<String, Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
