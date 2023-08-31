package com.debug;

import java.util.Arrays;

public class debug03 {
    public static void main(String[] args) {
        int [] arr = {1, -2, -10, -20, 100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            
        }
    }
}
