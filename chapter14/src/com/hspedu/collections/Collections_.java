package com.hspedu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("tom");
        list.add("smith ");
        list.add("king");
        list.add("millan");
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length() ;
            }
        });
        System.out.println(list);


        Collections.swap(list,0,1);
        System.out.println(list);

        System.out.println(Collections.max(list));
        Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length() ;
            }
        });
        System.out.println(list);

        System.out.println(Collections.frequency(list,"tom"));

        ArrayList list1 = new ArrayList();
        //Collections.copy(list1,list);
        for (int i = 0; i < list.size(); i++) {
            list1.add("");
        }
        Collections.copy(list1,list);
        System.out.println(list1);


        Collections.replaceAll(list1,"tom","汤姆");
        System.out.println(list1);
    }
}
