package com.hspedu.bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        //double d = 145352.343654643245235253667867986667856752;
       // System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("145352.3436546");
        System.out.println(bigDecimal);

        BigDecimal bigDecimal1 = new BigDecimal("6678.8948594895849");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
       // System.out.println(bigDecimal.divide(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }

}
