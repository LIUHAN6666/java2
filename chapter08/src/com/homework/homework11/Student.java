package com.homework.homework11;

public class Student extends Person{

    private String stu;

    public Student(String name, char gender, int age, String stu) {
       super(name, gender, age);
        this.stu = stu;
    }


    public String getStu() {
        return stu;
    }

    public void setStu(String stu) {
        this.stu = stu;
    }
    public void Study(){
        System.out.println(getName() + "我要好好学java");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }
    public void printinfo(){
        System.out.println("学生的信息：");
        System.out.println(super.baseinfo());
        System.out.println("学号： " + stu);
        Study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu='" + stu + '\'' +
                '}' + super.toString();
    }
}
