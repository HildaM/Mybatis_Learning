package com.quan.dao;

import com.quan.pojo.User;
import com.quan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserDaoTest {

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


    @Test
    public void testgetUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(2);
        System.out.println(user);

        sqlSession.close();
    }


    // 增删改查需要提交事务
    @Test
    public void testaddUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int Qian = mapper.addUser(new User(4, "千反田", "101010"));

        // 提交事务
        sqlSession.commit();

        User userQian = mapper.getUserById(4);
        System.out.println(userQian);

        sqlSession.close();
    }


    // 修改用户
    @Test
    public void testupdateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int userUpdate = mapper.updateUser(new User(3, "折木", "202020"));

        // 提交事务，完成修改
        sqlSession.commit();

        User userById = mapper.getUserById(3);
        System.out.println(userById);

        sqlSession.close();
    }


    // 删除用户
    @Test
    public void testdeleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(5);

        sqlSession.commit();

        sqlSession.close();
    }


    // 增删改查需要提交事务
    // 使用map优化
    @Test
    public void testaddUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("userid", 5);
        map.put("userpwd", "22223333");

        mapper.addUser2(map);

        sqlSession.commit();

        sqlSession.close();
    }


    // 使用map传参，实现按id查询
    @Test
    public void testgetUserById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("searchId", 4);
        map.put("searchName", "千反田");

        User userById2 = mapper.getUserById2(map);
        System.out.println(userById2);

        sqlSession.close();
    }


    // 模糊查询
    @Test
    public void testgetUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("%立%");

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}