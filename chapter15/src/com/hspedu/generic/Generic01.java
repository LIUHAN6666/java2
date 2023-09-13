package com.hspedu.generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Dog("旺财", 10));
        list.add(new Dog("丁真", 1));
        list.add(new Dog("小强", 5));

        list.add(new Cat("招财猫", 23));


        for (Object o : list) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }


    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
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

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
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
