package com.atguigu.morningtest;

import java.io.File;
import java.io.IOException;

public class TestTwo {
    public static void main(String[] args) {
        File file = new File("day20\\hello.txt");

        file.length();// 返回当前文件对象的大小，单位为字节
        file.exists();// 返回当前文件是否存在，true代表存在，false代表不存在
        file.isFile();// 如果当前文件对象代指文件则返回true，否则返回false
        file.isDirectory();// 如果当前文件对象代指文件夹则返回true，否则返回false
        file.getParent();// 返回当前文件对象的父文件夹路径
        file.getParentFile();// 返回当前文件对象的父文件夹文件对象
        file.getAbsolutePath();// 返回当前文件对象的绝对路径路径名
        file.getAbsoluteFile();// 返回当前文件对象的绝对路径文件对象
        try {
            file.createNewFile();// 创建文件对象代指的硬盘文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();// 删除文件对象代指的硬盘文件
        file.list();// 如果文件对象代指文件夹，那么list方法返回这个文件夹下的所有子文件夹及文件对象的String型数组
        file.listFiles();// 如果文件对象代指文件夹，那么listFiles方法返回这个文件夹下所有的子文件夹及文件的File型数组
        file.getName();// 返回该文件对象代指的文件夹的无路径文件名
    }
}
