package com.quan.dao;

import com.quan.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName: UserMapperImpl
 * @Description: 实体类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/20 19:11
 */
public class UserMapperImpl implements UserMapper {
    // 现在，我们的所有操作都使用 sqlSessionTemplate 来执行
    // 在原来，是用 sqlSession 来做的
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserList();
    }
}
