package com.hspedu.arraysmethod;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integers = {1,20,30};
        System.out.println(Arrays.toString(integers));

        Integer arr [] = {1,3,5,6,7,2};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2-i1;
            }
        });
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
