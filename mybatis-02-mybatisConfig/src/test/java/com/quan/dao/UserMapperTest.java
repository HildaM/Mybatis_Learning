package com.quan.dao;

import com.quan.pojo.User;
import com.quan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

class UserMapperTest {
    public static void main(String[] args) {
        new UserMapperTest().getUserList();
    }

    @Test
    void getUserList() {
        // 1. 获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            // 2. 执行
            // 方式一：getMapper（官方推荐）
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭sqlsession
            sqlSession.close();
        }

    }

}