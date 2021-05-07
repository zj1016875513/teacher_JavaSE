package com.atguigu.morningtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket socket;

    public ServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = br.readLine();
            System.out.println("这里是服务器，收到了客户端的请求信息，内容是："+s);
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
