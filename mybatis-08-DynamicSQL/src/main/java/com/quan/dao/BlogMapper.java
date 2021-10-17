package com.quan.dao;

import com.quan.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: BolgMapper
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/17 14:02
 */
public interface BlogMapper {
    // 插入数据
    int addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    // 查询第1.2.3号博客记录
    List<Blog> queryBlogForeach(Map map);

    // 更新数据
    int updateBlog(Map map);
}
