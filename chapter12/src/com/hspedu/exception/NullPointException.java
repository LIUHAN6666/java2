package com.hspedu.exception;

public class NullPointException extends Throwable {
    public static void main(String[] args) {
        String name =  null;
        System.out.println(name.length());



        int [] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }




     String name1 = "手";
        int n1 = Integer.parseInt(name);
        System.out.println(n1);



    }
}
