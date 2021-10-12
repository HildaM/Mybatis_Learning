package com.quan.dao;


import com.quan.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Description: UserDao接口，用以操作数据库
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/8 19:21
 */
public interface UserMapper {

    @Select("select * from mybatis_quan.user")
    List<User> getUsers();

    // 方法存在多个参数，所有参数前面必须加 @Param("...")
    // sql 中的id从 Param 中取！！！
    @Select("select * from mybatis_quan.user where id = #{id}")
    User getUserById(@Param("id") int id);

    // 引用对象不需要写 @Param
    @Insert("insert into user(id, name, pwd) values (#{id}, #{name}, #{password})")
    int addUser(User user);

    @Update("update user set name=#{name}, pwd=#{password} where id = #{id}")
    int uppdateUser(User user);

    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);

}
