package com.atguigu.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        try{

            ServerSocket ss = new ServerSocket(8888);
            Socket socket = ss.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String ask = br.readLine();
            System.out.println("这里是服务器，我收到了客户端的消息，消息的内容是:"+ask);
            socket.shutdownInput();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，客户端，我是服务器，我收到了你的消息");
            bw.flush();
            bw.close();
            br.close();
            socket.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
