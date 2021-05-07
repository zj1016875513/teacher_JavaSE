package com.atguigu.test;

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
            MyData<User> myData = new MyData<>();

            int choice;
            do {
                System.out.println("请输入要选择的菜单\n1、登录\n2、注册");
                choice  = input.nextInt();
                if(!(choice == 1 || choice == 2)){
                    System.out.println("请输入正确的菜单选项");
                }
            }while(!(choice == 1 || choice == 2));
            if(choice == 1) {
                myData.setOrder(OrderEnum.LOGIG);
            }else if(choice == 2){
                myData.setOrder(OrderEnum.ZHUCE);
            }
            System.out.println("请输入用户名");
            String loginId = input.next();
            System.out.println("请输入密码");
            String loginPwd = input.next();
            user.setLoginId(loginId);
            user.setLoginPwd(loginPwd);
            myData.setCurrType(user);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(myData);
            oos.flush();
            socket.shutdownOutput();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            MyData<User> resultData = (MyData<User>) ois.readObject();
//            if(resultData.getResult().isResultFlag()){
//                System.out.println("登录成功");
//            }else{
//                System.out.println("登录失败");
//            }
            System.out.println(resultData.getResult().getResultInfo());
            ois.close();
            oos.close();
            socket.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
