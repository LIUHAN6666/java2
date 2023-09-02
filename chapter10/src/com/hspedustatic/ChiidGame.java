package com.hspedustatic;

public class ChiidGame {
    public static void main(String[] args) {
        int count = 0;
        Child child = new Child("kun");
        child.join();
        count ++;
        Child child1 = new Child("ding");
        child1.join();
        count ++;
        Child child2 = new Child("bao");
        child2.join();
        count ++;
        System.out.println("共有" + count + "个小孩加入了游戏");
    }
}
class Child {
    private String name;
    public Child( String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + "加入了游戏..");
    }
}
