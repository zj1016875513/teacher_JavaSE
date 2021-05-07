package com.atguigu.test;

import java.io.*;

public class TestSeven {
    public static void main(String[] args) {
        try{
            long begin = System.currentTimeMillis();
            File fileOne = new File("day19\\day19-05-字节输入节点流.mp4");
            File fileTwo = new File("day19\\day19-05-字节输入节点流（副本）.mp4");

            if(!fileTwo.exists()){
                fileTwo.createNewFile();
            }

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileOne));
            BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(fileTwo));
            byte[] data = new byte[1024];
            while(true){
                int length = bis.read(data);
                if(length == -1){
                    break;
                }
                fos.write(data,0,length);
                fos.flush();
            }

            bis.close();
            fos.close();
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
