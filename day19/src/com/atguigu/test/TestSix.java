package com.atguigu.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TestSix {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\hello2.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            // 字符输出节点流
            FileWriter fw = new FileWriter(file,true);// 设置追加模式在节点流上设置
            // 带缓冲区的字符输出处理流
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("床前明月光");
            bw.newLine();
            bw.write("疑是地上霜");
            bw.newLine();
            bw.write("举头望明月");
            bw.newLine();
            bw.write("低头思故乡");
            bw.close();
            fw.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
