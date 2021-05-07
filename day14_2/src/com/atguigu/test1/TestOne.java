package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
        Stone sto = new Stone();

        Coustmer coustmer1 = new Coustmer(sto);
        Coustmer coustmer2 = new Coustmer(sto);
        Coustmer coustmer3 = new Coustmer(sto);

        Producter producter1 = new Producter(sto);
        Producter producter2 = new Producter(sto);
        Producter producter3 = new Producter(sto);

        coustmer1.start();
        coustmer2.start();
        coustmer3.start();

        producter1.start();
        producter2.start();
        producter3.start();
    }
}
