package com.hspdeu.ticket;

public class SellTicket {
    public static void main(String[] args) {
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }
}
class SellTicket02 implements Runnable {
    private int ticketNum2 = 100;
    @Override
    public void run() {
        while (true) {
            if (ticketNum2 <= 0) {
                System.out.println("OVER");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName()+ "售出一张票"
                    + "剩余票数" + (--ticketNum2));
        }
    }
}
