package com.atguigu.test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestThree {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\object.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            // 创建字节节点输出流
            FileOutputStream fos = new FileOutputStream(file);
            // 创建对象输出流
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student stu = new Student("tom",20,"男");
            oos.writeObject(stu);
            oos.flush();

            oos.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
