package com.homework;

public class Professor extends Teacher{
    public Professor (String name, int age, String post, double salary, double garade) {
        super(name, age, post, salary, garade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
