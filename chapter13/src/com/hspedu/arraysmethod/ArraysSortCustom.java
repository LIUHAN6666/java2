package com.hspedu.arraysmethod;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int [] arr = {1,34,2,56,43};
        //bubble01(arr);
       // System.out.println(Arrays.toString(arr));
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1-i2;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble01 (int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void bubble02 (int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(c.compare(arr[j],arr[j+ 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
