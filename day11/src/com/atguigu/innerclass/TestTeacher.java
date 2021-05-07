package com.atguigu.innerclass;

public class TestTeacher {
    public static void main(String[] args) {
        TestTeacher tt = new TestTeacher();
        tt.methodOne();
        System.out.println("----------------------------------------------------");
        // Teacher teacher = new LangTeacher();
        // teacher.shangKe();
        // 匿名内部类是局部内部类一种特殊形式，匿名内部类的作用是作为接口的实现类
        Teacher teacher = new Teacher(){
            @Override
            public void shangKe() {
                System.out.println("上数学课~~~~");
            }
        };
        teacher.shangKe();
        System.out.println("------------------------------------------------");
        Teacher teacher1 = new Teacher() {
            @Override
            public void shangKe() {
                System.out.println("上英语课");
            }
        };
        teacher1.shangKe();
    }

    public void methodOne(){
        new Teacher(){
            @Override
            public void shangKe() {
                System.out.println("上体育课");
            }
        }.shangKe();
    }

}
