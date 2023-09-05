package com.hspdeu.homework;

public class homework03 {
    public static void main(String[] args) {
        Animail cat = new Cat();
        Animail dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
abstract class Animail{
    public abstract void shout();

}
class Cat extends Animail {
    @Override
    public void shout() {
        System.out.println("miaomiao");
    }
}
class Dog extends Animail{
    @Override
    public void shout() {
        System.out.println("wangwang");
    }
}