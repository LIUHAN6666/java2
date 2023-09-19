package com.hspdeu.threadmethod;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("laolan");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println();
        }
        System.out.println(t.getName());
        t.interrupt();
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}
