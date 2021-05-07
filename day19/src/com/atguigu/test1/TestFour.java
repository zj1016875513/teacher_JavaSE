package com.atguigu.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class TestFour {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\object.txt");

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Student stu = (Student)ois.readObject();
            System.out.println(stu);

            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
