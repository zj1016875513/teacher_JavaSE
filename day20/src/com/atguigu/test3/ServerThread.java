package com.atguigu.test3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

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
                if (user.getLoginId().equals("Tom") && user.getLoginPwd().equals("123456")) {
                    result.setResultFlag(true);
                    result.setResultInfo("用户名密码验证通过，恭喜用户登录成功");
                } else {
                    result.setResultFlag(false);
                    result.setResultInfo("用户名或密码错误，请重新输入");
                }
            }else if(order == OrderEnum.LOGIG){

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
