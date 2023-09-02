package com.extendsVSinterface;

public class ExtendsVSInterface {
    public static void main(String[] args) {
        littleMonkey 悟空 = new littleMonkey("悟空");
        悟空.climbing();
        悟空.swiming();
        悟空.flying();
    }
}

abstract class Monkey {
    public String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void climbing() {
        System.out.println(name + "会爬树");

    }

    public abstract void swiming();
}

interface Fishable {
    void swiming();
}

interface Bird {
    void flying();
}
class littleMonkey extends Monkey implements Fishable, Bird{

    public littleMonkey(String name) {
        super(name);
    }


    @Override
    public void swiming() {
        System.out.println(getName() + "通过学习可以像小鱼一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习可以像小鸟一样飞行");
    }
}
