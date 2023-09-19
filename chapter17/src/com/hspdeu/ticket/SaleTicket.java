package com.hspdeu.ticket;

public class SaleTicket {
    public static void main(String[] args) {
        SaleTicket01 saleTicket01 = new SaleTicket01();
        SaleTicket01 saleTicket02 = new SaleTicket01();
        SaleTicket01 saleTicket03 = new SaleTicket01();
        saleTicket01.start();
        saleTicket02.start();
        saleTicket03.start();
    }
}
class SaleTicket01 extends Thread{
    private static int ticketNum = 100;
    @Override
    public void run() {
       while (true) {
           if (ticketNum <= 0) {
               System.out.println("OVER");
               break;
           }
           try {
               Thread.sleep(50);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("窗口" + Thread.currentThread().getName()+ "售出一张票"
           + "剩余票数" + (--ticketNum));
       }
    }
}