package com.single;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
    }
}

class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;

    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小黑");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
