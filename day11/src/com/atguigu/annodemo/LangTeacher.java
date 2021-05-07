package com.atguigu.annodemo;

/**
 * 文档注释
 */
public class LangTeacher extends Teacher {
    // 检测方法重写是否符合语法
    @Override
    public void shangKe() {
        System.out.println("上语文课");
        // 单行注释
        /*
            多行注释
         */
    }
}
