package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIstFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("北京");
        list.add("上海");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next);
        }

            for (Object o : list) {
                System.out.print(o);

            }


            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }

    }
}
