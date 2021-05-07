package com.atguigu.test2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",8888);
            User user = new User();
            Scanner input = new Scanner(System.in);
            System.out.println("请输入用户名");
            String loginId = input.next();
            System.out.println("请输入密码");
            String loginPwd = input.next();
            user.setLoginId(loginId);
            user.setLoginPwd(loginPwd);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user);
            oos.flush();
            socket.shutdownOutput();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Result result = (Result)ois.readObject();
            if(result.isResultFlag()){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
            System.out.println(result.getResultInfo());
            ois.close();
            oos.close();
            socket.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
