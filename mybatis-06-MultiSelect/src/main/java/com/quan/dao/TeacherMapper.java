package com.quan.dao;

import com.quan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName: TeacherMapper
 * @Description: 老师接口
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/14 15:35
 */
public interface TeacherMapper {
      // 查询老师
//    @Select("select * from teacher where id = #{tid}")
//    Teacher getTeacherById(@Param("tid") int id);
    Teacher getTeacherById(int id);
}
