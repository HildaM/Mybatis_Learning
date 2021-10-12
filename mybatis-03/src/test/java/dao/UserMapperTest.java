package dao;

import com.quan.dao.UserMapper;
import com.quan.pojo.User;
import com.quan.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;


class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    void getUserList() {
        // 1. 获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            // 2. 执行
            // 方式一：getMapper（官方推荐）
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(4);

            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭sqlsession
            sqlSession.close();
        }

    }


    @Test
    public void testLog4J() {
        // .........代码内容
        logger.info("info: 进入了testLog4J方法");

        // .........代码内容
        logger.debug("debug: 进入了testLog4J方法");

        // .........代码内容
        logger.error("error: 进入了testLog4J方法");
    }


    @Test
    public void testgetUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 5);
        List<User> userList = mapper.getUserByLimit(map);

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }


    @Test
    public void testgetUserByRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // RowBounds
        RowBounds rowBounds = new RowBounds(1, 2);

        // 通过Java代码层面实现分页
        List<User> userList = sqlSession.selectList("com.com.com.quan.dao.UserMapper.getUserByRowBounds", null, rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}