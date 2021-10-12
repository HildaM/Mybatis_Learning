package com.quan.dao;

import com.quan.pojo.Student;
import com.quan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

    @Test
    void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();

        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    void getStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent2();

        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}