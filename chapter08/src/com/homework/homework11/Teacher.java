package com.homework.homework11;

public class Teacher extends Person{

    private int workage;

    public Teacher(String name, char gender, int age, int workage) {
        super(name, gender, age);
        this.workage = workage;
    }


    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }


    public void Teach() {
        System.out.println(getName() + "我要好好教java");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }
    public void printinfo(){
        System.out.println("老师的信息：");
        System.out.println(super.baseinfo());
        System.out.println("工龄：" + workage);
        Teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workage=" + workage +
                '}' + super.toString();
    }
}
