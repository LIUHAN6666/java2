package com.hspedu.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        System.out.println("ok1");
        System.out.println("ok2");
       // System.exit(0);
        //System.out.println("ok3");

        int [] scr = {1,2,3};
        int [] desr = new int[3];
        System.arraycopy(scr,0,desr,1,2);
        System.out.println(Arrays.toString(desr));


        System.out.println(System.currentTimeMillis());
    }
}
