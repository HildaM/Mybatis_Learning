package com.quan.dao;

import com.quan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: TeacherMapper
 * @Description: 老师接口
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/14 15:35
 */
public interface TeacherMapper {
    // 获取所有老师
    List<Teacher> getTeacher();

    // 获取指定老师下的所有学生，及老师的信息
    Teacher getTeacher2(@Param("tid") int id);

    // 子查询
    Teacher getTeacher3(@Param("tid") int id);
}
