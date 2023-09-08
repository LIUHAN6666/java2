package com.hspedu.arraysmethod;

import java.util.Arrays;

public class ArraysMethod2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,9,34,45};
        int index = Arrays.binarySearch(arr,78);
        System.out.println(index);

        Integer[] newarr = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(newarr));

        Integer[] num = new Integer[] {7,3,24};
        Arrays.fill(num, 56);
        System.out.println(Arrays.toString(num));

        Integer[] arr2 = {5,67,88,32,45};
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println(equals);

    }
}
