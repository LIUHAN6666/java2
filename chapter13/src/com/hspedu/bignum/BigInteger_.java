package com.hspedu.bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("232323454454534535353533334353543");
        System.out.println(bigInteger);

        BigInteger bigInteger1 = new BigInteger("4334343335464646453694643969463");

        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);

        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);

        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);

        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);

    }
}
