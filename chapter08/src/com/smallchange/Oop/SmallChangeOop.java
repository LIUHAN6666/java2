package com.smallchange.Oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOop {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "-------------零钱通明细-------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat saf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";

    public void mainMenu() {
        do {
            System.out.println("==========零钱通oop==========");
            System.out.println("\t\t\t1零钱通明细");
            System.out.println("\t\t\t2收益入账");
            System.out.println("\t\t\t3消   费");
            System.out.println("\t\t\t4退   出");
            System.out.println("请选择(1-4):");
            key = scanner.next();
            switch (key) {
                case "1":
                   this.details();
                    break;
                case "2":
                    this.income();
                        break;

                case "3":
                   this.pay();
                    break;
                case "4":
                   this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
    }
    public void details () {
        System.out.println(details);
    }
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        if(money <= 0) {
            System.out.println("收益入账金额必须大于0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账+" + note + "\t" + money + "\t" + saf.format(date)
                + "\t" + balance;
    }
    public void pay(){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.println("你的消费金额应该在0-" + balance);
           return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + saf.format(date)
                + "\t" + balance;
    }
    public void exit(){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.println("你的消费金额应该在0-" + balance);
           return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + saf.format(date)
                + "\t" + balance;
    }
}
