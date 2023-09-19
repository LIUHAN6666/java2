package com.hspdeu.threadmethod;

public class ThreadExercise01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t3= new Thread((new T3()));
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            if(i == 5) {
                t3.start();
                t3.join();
            }
        }
    }
}
class T3 implements Runnable{
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello" + (++count));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 10) {
                break;
            }
        }
    }
}
