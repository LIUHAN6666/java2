package com.Poly;

public class Polyo1 {
    public static void main(String[] args) {
        Master master = new Master("丁真");
        Dog dog = new Dog("大黄……");
        Bone bone = new Bone("排骨……");
                master.feed(dog,bone);
        System.out.println("=============");
              Cat cat = new Cat("花猫");
        Fish fish = new Fish("黄花鱼");
        master.feed(cat, fish);
        System.out.println("=============");
        Pig pig = new Pig("小花猪");
        Rice rice =new Rice("米饭");
        master.feed(pig, rice);
    }


}
