package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 23));
        col.add(new Book("小李飞刀", "古龙", 25));
        col.add(new Book("还珠格格", "琼瑶", 32));


            for (Object book :col) {
                System.out.println(book);

            }

        }
    }

