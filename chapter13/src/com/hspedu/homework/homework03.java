package com.hspedu.homework;

public class homework03 {
    public static void main(String[] args) {
        String name = "Han shun Ping";
          pN(name);
    }

    public static void pN (String str) {
        if (str == null) {
            System.out.println("str 不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("格式不对");
            return;
        }
        String format = String.format("%2s, %s, %c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
