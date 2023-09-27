package com.hspedu.printstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWrite01 {
    public static void main(String[] args) throws Exception{
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.print("nihao");
        printWriter.close();


        PrintWriter printWriter1 = new PrintWriter(new FileWriter("e\\f2.txt"));
        printWriter.print("nihao");
        printWriter.close();
    }
}
