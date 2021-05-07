package com.atguigu.school;

public class Lesson {
    public static void main(String[] args) {
        EnglishTeacher en=new EnglishTeacher();
        Maste ma= new Maste();
        ma.Lesson(en);//方法传参

        System.out.println("----------------------");

        Teacher teacher=new LanuageTeacher();//向上转型  用上面更抽象的对象接下面的具体对象
//        Teacher teacher=new Teacher();
        teacher.ShangKe();

        System.out.println("*******************");
        //LanuageTeacher la=new LanuageTeacher();
        LanuageTeacher la=(LanuageTeacher)teacher;//向下转型  用下面更具体的对象接  上面更抽象的对象强转为具体对象后的对象
        la.ShangKe();
        la.ShangGuwen();
    }
}
