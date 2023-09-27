package com.hspedu.printstream;

import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws Exception {
        PrintStream out = System.out;
        out.print("john,hello");
        out.write("hello".getBytes());

        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("hello.world");

        out.close();

    }
}
