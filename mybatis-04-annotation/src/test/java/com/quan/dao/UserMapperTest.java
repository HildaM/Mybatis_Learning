package com.quan.dao;

import com.quan.pojo.User;
import com.quan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    public void getUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(4);
        System.out.println(user);

        sqlSession.close();
    }


    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int liZhi = mapper.addUser(new User(6, "里志", "98565"));

        sqlSession.close();
    }
    
    
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.uppdateUser(new User(6, "里志", "2115697"));

        sqlSession.close();
    }


    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);

        sqlSession.close();
    }
}