package com.quan.dao;

import com.quan.pojo.User;
import com.quan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    void queryUserById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(4);
        System.out.println(user);

        mapper.updateUser(new User(2, "HildaQuan", "484984984"));

        System.out.println("======================");
        User user2 = mapper.queryUserById(4);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlSession.close();
    }

    @Test
    void flushCache() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(4);
        System.out.println(user);

        // 手动清理缓存
        sqlSession.clearCache();

        System.out.println("======================");
        User user2 = mapper.queryUserById(4);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlSession.close();
    }

    @Test
    void testSecondCache() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(4);
        System.out.println(user);

        sqlSession.close();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(4);
        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession2.close();
    }
}