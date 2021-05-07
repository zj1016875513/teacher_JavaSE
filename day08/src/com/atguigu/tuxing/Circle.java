package com.atguigu.tuxing;

public class Circle extends Graphic {
    private double radius;
    // 子类必须在自己构造方法的第一行调用父类的构造方法
    public Circle(String name){
        super(name);
    }

 /*   public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }*/

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

  /*  @Override
    public String getInfo() {
        return super.getInfo()+",半径："+radius;*//*
    }*/
}
