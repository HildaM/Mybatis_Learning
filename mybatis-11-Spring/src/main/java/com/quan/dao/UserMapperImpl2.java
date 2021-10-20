package com.quan.dao;

import com.quan.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName: UserMapperImpl2
 * @Description: 第二种方法
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/20 20:23
 */

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUserList() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserList();

//        return getSqlSession().getMapper(UserMapper.class).getUserList();
    }
}
