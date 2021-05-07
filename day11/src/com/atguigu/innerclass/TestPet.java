package com.atguigu.innerclass;

public class TestPet {
    public static void main(String[] args) {
        /*
        Pet pet = new Pet(){
            @Override
            public void play() {
                System.out.println("玩丢飞盘");
            }
        };
        pet.play();
        */
        class Dog extends Pet{
            @Override
            public void play() {
                System.out.println("玩儿丢飞盘");
            }
        }

        Pet pet = new Dog();
        pet.play();
    }
}
