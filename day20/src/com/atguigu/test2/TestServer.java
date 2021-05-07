package com.atguigu.test2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8888);
            while(true){
                Socket socket = ss.accept();
                ServerThread st = new ServerThread(socket);
                st.start();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
