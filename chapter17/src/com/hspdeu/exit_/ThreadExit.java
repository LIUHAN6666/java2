package com.hspdeu.exit_;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        Thread.sleep(10* 1000);
        t.setLoop(false);
    }
}
class T extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("runtime");
        }
    }
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
