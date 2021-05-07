package com.atguigu.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestOne {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\hello.txt");

            // 创建字节节点输入流对象
            FileInputStream fis = new FileInputStream(file);

            // 创建中转输入流对象
            InputStreamReader isr = new InputStreamReader(fis);

            // 利用中转输入流对象创建字符输入处理流对象
            BufferedReader br = new BufferedReader(isr);

            while(true){
                String s = br.readLine();
                if(s == null){
                    break;
                }
                System.out.println(s);
            }

            br.close();
            isr.close();
            fis.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
