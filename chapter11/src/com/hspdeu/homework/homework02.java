package com.hspdeu.homework;

public class homework02 {

}
class Frock{
    private static int currentNum = 10000;
    private int serialNumber;
    public static  int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
    public Frock(){
        serialNumber = getSerialNumber();
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getNextNum());
        System.out.println(frock1.getNextNum());
        System.out.println(frock2.getNextNum());
    }
}
