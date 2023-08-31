package com.homework.homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 1000);
        jack.printsal();
        Peasant simth = new Peasant("simth", 2000);
        simth.printsal();
        Teacher teacher = new Teacher("老韩", 2000);
        teacher.setClassDays(360);
        teacher.setClassSal(1000);
        teacher.printsal();
        Scientist scientist = new Scientist("大壮", 30000);
        scientist.setBonus(800000);
        scientist.printsal();

    }
}
