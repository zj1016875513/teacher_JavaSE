package com.atguigu.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        try {
            File file = new File("day20\\users.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            List<User> list = new ArrayList<>();
            String word = "";
            while ((word = br.readLine()) != null) {
                User currUser = new User();
                String[] userData = word.split("\\|");
                currUser.setLoginId(userData[0]);
                currUser.setLoginPwd(userData[1]);
                list.add(currUser);
            }

            for (User user : list) {
                System.out.println(user);
            }
        }catch (Exception ex){

        }
    }
}
