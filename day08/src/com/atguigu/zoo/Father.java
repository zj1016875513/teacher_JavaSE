package com.atguigu.zoo;

public class Father {
    public int one = 1;
    private int two = 1;
    public int three = 1;

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.one);// 创建的是子类对象，子类优先访问自己的属性，one的值子类的属性值
        System.out.println(son.getTwo());
        System.out.println(son.three);// 创建的是子类对象，子类优先访问自己的属性，但是子类没有three，所以向上访问父类的three
        System.out.println(son.four);// 子类独有的属性
    }
}

class Son extends Father{
    public int one = 2;
    private int two = 2;
    public int four = 2;


}
