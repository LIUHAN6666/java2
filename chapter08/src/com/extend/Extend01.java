package com.extend;

public class Extend01 {
    public static void main(String[] args) {

    Pupil pupil = new Pupil();
    pupil.name = "小黄";
    pupil.age = 12;
    pupil.testing();
    pupil.setScore(60);
    pupil.showInfo();
        System.out.println("----------");
    Graduate graduate = new Graduate();
    graduate.name = "保国";
    graduate.age = 33;
    graduate.testing();
    graduate.setScore(100);
    graduate.showInfo();


}
}