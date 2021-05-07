package com.atguigu.test;

import java.io.File;
import java.io.IOException;

public class TestOne {
    public static void main(String[] args) {
        try {
            File file1= new File("D:\\temp\\hello1.txt");// 绝对路径构建File对象
            File file = new File("day19\\hello.txt");// 相对路径构建File对象，使用idea的project相对路径起点是project根目录
            System.out.println(file.exists());// 判断当前路径是否存在文件，true表示该文件存在，false表示不存在
            System.out.println(file.getName());// 返回当前File对象代指的文件的文件名
            String path = file.getAbsolutePath();// 返回当前文件的绝对路径
            File fileOne = file.getAbsoluteFile();// 返回当前文件的绝对路径文件
            if(!file1.exists()) {
                file1.createNewFile();// 创建一个新的文件
            }
            file1.delete();// 删除一个文件

            System.out.println(file.isFile());// 判断当前File对象是否为文件，是文件返回true，不是文件返回false
            System.out.println(file.isDirectory());// 判断当前File对象是否为一个文件夹，是文件夹返回true，不是文件夹返回false

            if(file.isDirectory()){
                if(!file.exists()){
                    file.mkdir();// 创建文件夹
                }
            }

            System.out.println(file.length());// 当前文件的大小
            System.out.println(file.getParent());// 当前文件或文件夹的上一级文件夹名
            File file2 = file.getParentFile();// 当前文件或文件夹的上一级文件夹对象
            if(file.isDirectory()) {
                String[] subFileString = file.list();// 返回当前文件夹下所有的子文件及子文件夹的名字
                File[] subFiles = file.listFiles();// 返回当前文件夹下所有的子文件及子文件夹的文件对象
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
