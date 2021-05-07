package com.atguigu.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFour {
    public static void main(String[] args) {
        try{
            File fileOne = new File("day19\\尚硅谷_张锐_JavaSE_day19【IO流】.md");
            File fileTwo = new File("day19\\尚硅谷_张锐_JavaSE_day19【IO流】（副本）.md");

            if(!fileTwo.exists()){
                fileTwo.createNewFile();
            }

            byte[] datas = new byte[1024];

            FileInputStream fis = new FileInputStream(fileOne);
            FileOutputStream fos = new FileOutputStream(fileTwo);

            while(true){
                int length = fis.read(datas);
                if(length == -1){
                    break;
                }
                fos.write(datas,0,length);
            }

            fis.close();
            fos.close();


        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
