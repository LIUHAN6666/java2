package com.homework.homework04;


public class Homework04 {
    public static void main(String[] args) {
        manager man = new manager("张飞", 100, 20, 1.2);
        man.setBonus(3000);
        man.printSal();
        Worker worker = new Worker("关羽", 100, 30, 1.0);
        worker.printSal();
    }
}
