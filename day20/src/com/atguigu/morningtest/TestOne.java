package com.atguigu.morningtest;

import java.io.*;

public class TestOne {
    public static void main(String[] args) {
        try{
            File fileOne = new File("day20\\JavaSE复习笔记.md");
            File fileTwo = new File("day20\\JavaSE复习笔记(副本).md");
            if(!fileTwo.exists()){
                fileTwo.createNewFile();
            }
            // 创建字节输入节点流
            FileInputStream fis = new FileInputStream(fileOne);
            // 以字节节点流为基础创建带缓冲区的字节处理输入流
            BufferedInputStream bis = new BufferedInputStream(fis);

            // 以字节节点输出为基础创建字节处理输出流
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileTwo));

            byte[] datas = new byte[1024];

            while(true){
                int length = bis.read(datas);
                if(length == -1){
                    break;
                }
                bos.write(datas,0,length);
                bos.flush();
            }

            bos.close();
            bis.close();
            fis.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
