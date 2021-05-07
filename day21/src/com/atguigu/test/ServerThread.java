package com.atguigu.test;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread {

    private Socket socket;

    public ServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            MyData<User> myData = (MyData<User>) ois.readObject();
            Result result = new Result();
            OrderEnum order = myData.getOrder();
            if(order == OrderEnum.LOGIG){
                User user = myData.getCurrType();
                System.out.println(user.getLoginId()+"~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                File file = new File("day21\\users.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                List<User> list = new ArrayList<>();
                String word = "";
                while((word = br.readLine()) != null){
                    User currUser = new User();
                    String[] userData = word.split("\\|");
                    currUser.setLoginId(userData[0]);
                    currUser.setLoginPwd(userData[1]);
                    list.add(currUser);
                }
                boolean flag = false;
                for (User user1 : list) {
                    if (user.getLoginId().equals(user1.getLoginId())&&user.getLoginPwd().equals(user1.getLoginPwd())) {
                        flag = true;
                        break;
                    }
                }

                if(flag){
                    result.setResultFlag(true);
                    result.setResultInfo("用户名密码验证通过，恭喜用户登录成功");
                }else{
                    result.setResultFlag(false);
                    result.setResultInfo("用户名或密码错误，请重新输入");
                }

            }else if(order == OrderEnum.ZHUCE){
                User user = myData.getCurrType();
                BufferedWriter bw = new BufferedWriter(new FileWriter("day21\\users.txt",true));
                bw.newLine();
                bw.write(user.getLoginId()+"|"+user.getLoginPwd());
                bw.flush();
                bw.close();
                result.setResultFlag(true);
                result.setResultInfo("注册成功");
            }
            socket.shutdownInput();
            MyData returnData = new MyData();
            returnData.setResult(result);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(returnData);
            oos.flush();
            oos.close();
            ois.close();
            socket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
