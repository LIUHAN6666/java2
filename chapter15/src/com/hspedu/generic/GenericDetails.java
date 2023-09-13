package com.hspedu.generic;

import java.util.ArrayList;

public class GenericDetails {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
       // ArrayList<int> integer1 = new ArrayList<int>();
        Pig<A> list = new Pig<>(new A());
        Pig<A> list1 = new Pig<>(new B());



    }
}
class A{}
class B extends A{}

class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
}