package com.hspedu.stringbuffer;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {

      //  Scanner scanner = new Scanner(System.in);
        String price = "1244443564.59";
        StringBuffer sb = new StringBuffer(price);
      //  int j = sb.lastIndexOf(".");
    //   sb = sb.insert(j - 3, ",");
        for (int i = sb.lastIndexOf(".") - 3; i > 0 ; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
