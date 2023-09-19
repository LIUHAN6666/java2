package com.hspdeu.threadmethod;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println("宝强在辛苦工作" + i);
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (; ;) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马容和宋喆聊个没完");
        }
    }
}