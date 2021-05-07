package com.atguigu.test;

import java.io.File;
import java.io.FileInputStream;

public class TestTwo {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\hello.txt");

            // 字节输入节点流
            FileInputStream fis = new FileInputStream(file);

            // fis.read();// 一次读取一个字节，将该字节的整数返回，如果返回-1则表示没有读到任何内容

            /*
            while(true){
                int code = fis.read();
                if(code == -1){
                    break;
                }
                char c = (char)code;
                System.out.print(c);
            }
            */

            byte[] data = new byte[(int)file.length()];

            fis.read(data);

            String s = new String(data);
            System.out.println(s);

            fis.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
