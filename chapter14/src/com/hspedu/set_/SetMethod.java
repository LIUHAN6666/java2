package com.hspedu.set_;



import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class SetMethod {
    public static void main(String[] args) {


        HashSet set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        HashSet hashSet = new HashSet();
        hashSet.add("lucy");
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        System.out.println(hashSet);

        hashSet.add(new String("hsp"));
        hashSet.add(new String("hsp"));
        System.out.println(hashSet);

    }
}
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}