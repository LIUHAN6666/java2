package com.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}
class GrandPa {//爷爷类
    String name = "老王";
    String hobby = "旅游";
}
class Father extends GrandPa {//父类
    String name = "大头爸爸";
    int age = 39;
}
class Son extends Father {
    String name = "大头儿子";
}
