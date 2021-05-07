package com.atguigu.test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8888);
            Socket socket = ss.accept();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            User user = (User)ois.readObject();
            Result result = new Result();
            if(user.getLoginId().equals("Tom")&&user.getLoginPwd().equals("123456")){
                result.setResultFlag(true);
                result.setResultInfo("用户名密码验证通过，恭喜用户登录成功");
            }else{
                result.setResultFlag(false);
                result.setResultInfo("用户名或密码错误，请重新输入");
            }
            socket.shutdownInput();
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(result);
            oos.flush();
            oos.close();
            ois.close();
            socket.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
