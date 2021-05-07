package com.atguigu.zoo;

public class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(3);
        cat.setGender("公的");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getGender());
        cat.setType("狸花猫");
        System.out.println(cat.getType());
        cat.play();
        Dog dog = new Dog();
        dog.play();
        dog.work();
    }
}
