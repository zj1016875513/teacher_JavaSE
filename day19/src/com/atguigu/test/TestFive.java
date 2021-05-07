package com.atguigu.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestFive {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\hello.txt");

            // 字符输入节点流
            FileReader fr = new FileReader(file);
            // 带有缓冲区的字符输入处理流
            BufferedReader br = new BufferedReader(fr);
            while(true) {
                String s = br.readLine();
                if(s == null){
                    break;
                }
                System.out.println(s);
            }

            br.close();
            fr.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
