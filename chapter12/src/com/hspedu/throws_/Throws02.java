package com.hspedu.throws_;

import com.hspedu.exception.NullPointException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws02 {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() {
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() {
        try {
            f3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}

class Farher {
    public void method() throws RuntimeException {

    }
}

class Son extends Farher {

    public void method() throws RuntimeException {

    }
}