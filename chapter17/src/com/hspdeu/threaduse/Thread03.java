package com.hspdeu.threaduse;

public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
class T1 implements Runnable{
    int num = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello,world" + (++num));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num == 10) {
                break;
            }
        }
    }
}
class T2 implements Runnable{
    int num1 = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("你好，世界" + (++num1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num1==5) {
                break;
            }
        }
    }
}