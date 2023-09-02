package com.hspedustatic;

public class StaticMethod {
    public static void main(String[] args) {

 Stu tom = new Stu("tom");
 tom.payFee(100);
 Stu mary = new Stu("mary");
 mary.payFee(200);
 Stu.showFee();
}
}
class Stu {
    private String name;

   private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee) {
        Stu.fee += fee;
    }
    public static void showFee() {
        System.out.println("总学费有：" + Stu.fee);
    }

}
