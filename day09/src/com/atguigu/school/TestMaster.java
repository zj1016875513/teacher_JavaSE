package com.atguigu.school;

public class TestMaster {
    public static void main(String[] args) {
        Master master = new Master();
        LangTeacher lt = new LangTeacher();
        EnglishTeacher et = new EnglishTeacher();

        // =号左侧被称作编译时类型，=右侧被称作运行时类型
        Teacher teacher = new LangTeacher();
        teacher.shangKe();
        master.askTeacher(et);
    }
}
