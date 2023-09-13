package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
        list.remove(0);
        list.remove(true);
        System.out.println(list);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
       // list.clear()
        List list2 = new ArrayList();
        list2.add("丁真");
        list2.add("保国");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
    }
}
