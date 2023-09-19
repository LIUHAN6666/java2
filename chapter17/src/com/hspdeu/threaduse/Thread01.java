package com.hspdeu.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
class Cat extends Thread{
    int time = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵" + (++time));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time == 30) {
                break;
            }
        }
    }
}