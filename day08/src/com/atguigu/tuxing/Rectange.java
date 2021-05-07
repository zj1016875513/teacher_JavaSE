package com.atguigu.tuxing;

public class Rectange extends Graphic{
    private double length;
    private double width;
    public Rectange(String name){
        super(name);//给父类构造方法传name参数
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

 /*   @Override
    public String getInfo() {
        return super.getInfo();
    }*/
}
