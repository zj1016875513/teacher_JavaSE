package com.atguigu.test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TestTwo {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\hello3.txt");
            if(!file.exists()){
                file.createNewFile();
            }

            // 使用字节节点流创建字符处理流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)));

            bw.write("鹅鹅鹅");
            bw.flush();
            bw.newLine();
            bw.write("曲项向天歌");
            bw.flush();
            bw.newLine();
            bw.write("白毛浮绿水");
            bw.flush();
            bw.newLine();
            bw.write("红掌拨清波");
            bw.flush();

            bw.close();
            System.out.println(file.length());//输出文件大小

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
