package com.quan.dao;

import com.quan.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Description: 用户接口
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/18 19:25
 */
public interface UserMapper {
    // 根据 ID 查询
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
