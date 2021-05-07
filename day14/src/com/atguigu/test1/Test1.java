package com.atguigu.test1;

public class Test1 {
    public static void main(String[] args) {
        Stone stone=new Stone();

        Coustmer coustmer1=new Coustmer(stone);
        Coustmer coustmer2=new Coustmer(stone);
        Coustmer coustmer3=new Coustmer(stone);

        Producter producter1=new Producter(stone);
        Producter producter2=new Producter(stone);
        Producter producter3=new Producter(stone);

        coustmer1.start();
        coustmer2.start();
        coustmer3.start();
        producter1.start();
        producter2.start();
        producter3.start();

    }
}
