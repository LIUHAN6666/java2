package com.hspedu.map_;

import java.util.HashMap;
import java.util.Objects;

public class HashMapSource {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 1; i <=12; i++) {
            map.put(new A (i),"hello");
        }
        System.out.println(map);
    }
}
class A {
    private int num;

    public A(int num) {
        this.num = num;
    }



    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\n" +"A" +
                "num=" + num ;
    }
}
