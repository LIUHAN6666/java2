package com.object;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aa2 = aa;
        System.out.println("aa.hashcode()=" + aa.hashCode());
        System.out.println("aa.hashcode()=" + aa1.hashCode());
        System.out.println("aa.hashcode()=" + aa2.hashCode());
    }
}
class AA{}
