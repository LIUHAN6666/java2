package com.hspdeu.syn;

public class SellTicket03_ {
    public static void main(String[] args) {
        SellTicket03 sell03 = new SellTicket03();
        new Thread(sell03).start();
        new Thread(sell03).start();
        new Thread(sell03).start();

    }
}
class SellTicket03 implements Runnable {
    private int ticketNum2 = 100;
    private boolean loop = true;
    public synchronized void m() {
        if (ticketNum2 <= 0) {
            System.out.println("OVER");
            loop = false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口" + Thread.currentThread().getName()+ "售出一张票"
                + "剩余票数" + (--ticketNum2));
    }
    @Override
    public void run() {
        while (loop) {
           m();
        }
    }
}
