package com.quan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/8 19:19
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
}
