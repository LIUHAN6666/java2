package com.hspdeu.homework;

public class homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new IC() {
    @Override
    public double work(double n1, double n2) {
        return n1 + n2;
    }
},10, 8);
    }
}
interface IC {
    public double work (double n1, double n2);
}
class Cellphone {
    public void  testWork (IC ic, double n1, double n2){
        double work = ic.work(n1, n2);
        System.out.println("计算后的结果是：" + work);
    }
}
