package com.hspedu.homework;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("simth", 2900);
        map.put("jack", 2600);
        System.out.println(map);

        Set set = map.keySet();
        for (Object key : map.keySet()) {
            map.put(key, (Integer) map.get(key) + 100);
        }
        System.out.println(map);

        Set set1 = map.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next() ;
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }
        Collection values = map.values();
        for (Object o :values) {
            System.out.println(o);
        }

    }
}
