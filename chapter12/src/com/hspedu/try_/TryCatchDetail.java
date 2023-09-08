package com.hspedu.try_;

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "sdds";
            int a = Integer.parseInt(str);
            System.out.println(" " + str);
        } catch (NumberFormatException e) {
            System.out.println("catch");
        }
        finally {
            System.out.println("fianaly");
        }
        System.out.println("jixu");
    }
}
