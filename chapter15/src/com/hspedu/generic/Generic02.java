package com.hspedu.generic;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog1> list = new ArrayList<Dog1>();
        list.add(new Dog1("旺财", 10));

        list.add(new Dog1("丁真", 1));
        list.add(new Dog1("小强", 5));


        //list.add(new Cat1("招财猫", 23));报错


        for (Dog1 dog1 :list) {
            System.out.println(dog1.getName() + "  " + dog1.getAge());
        }

    }
}
class Dog1{
    private String name;
    private int age;

    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat1{
    private String name;
    private int age;

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
