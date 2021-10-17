package com.quan.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @ClassName: IDUtils
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/17 14:06
 */
public class IDUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
        // 将原本生成序列中的 “-” 去掉
    }

    @Test
    public void test() {
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
    }
}
