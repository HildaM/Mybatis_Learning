package com.quan.dao;

import com.quan.pojo.Student;

import java.util.List;

/**
 * @ClassName: StudentMapper
 * @Description: 学生接口
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/14 15:35
 */
public interface StudentMapper {
    // 查询所有的学生信息，以及对应的老师的信息
    List<Student> getStudent();

    List<Student> getStudent2();

}
