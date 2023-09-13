package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class LIstMetgod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add(1, "关羽");
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("曹操");
        list1.add("jack");
        list.addAll(1,list1);
        System.out.println(list);
        System.out.println(list.indexOf("tom"));
        System.out.println(list.lastIndexOf("jack"));
        list.remove(0);
        System.out.println(list);
        list.set(1,"dark");
        System.out.println(list);
        List returnlist = list.subList(0,1);
        System.out.println(returnlist);
    }
}
