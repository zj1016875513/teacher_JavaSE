package com.atguigu.test;

import java.io.File;
import java.io.FileOutputStream;

public class TestThree {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\helloworld.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file,true);

            fos.write(97);

            String word = "hello kitty";
            byte[] data = word.getBytes();
            fos.write(data);

            fos.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
