package com.atguigu.tuxing;

public class Graphic {
    private String name;

    public Graphic(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea(){
        return 0.0;
    }

    public double getPerimeter(){
        return 0.0;
    }

    public String getInfo(){
        return "图形名称："+name+",周长："+getPerimeter()+"，面积："+getArea();
    }
}
