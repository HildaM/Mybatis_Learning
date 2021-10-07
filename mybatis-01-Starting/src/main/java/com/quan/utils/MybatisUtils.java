package com.quan.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: MybatisUtils
 * @Description: mybatis 工具类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/7 20:44
 */

// 获取sqlSessionFactory 用以构造sqlSession
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;


    // 静态代码块，一开始就会执行它
    static {
        // 获取 sqlSessionFactory 对象
        try {
            String resource = "mybatis-conf.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
    // SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

}
