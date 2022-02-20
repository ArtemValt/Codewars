package com.codewars.five;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger value = new BigInteger(String.valueOf(n));
        int intValue = value.intValue() + 1;//32145

        BigInteger firstValue = new BigInteger("1");
        BigInteger secondValue = new BigInteger("1");
        BigInteger thirdValue = new BigInteger("0");
        BigInteger result = new BigInteger("2");

        for (int i = 3; i <= intValue; i++) {
            thirdValue = firstValue.add(secondValue);
            firstValue = secondValue;
            secondValue = thirdValue;
            result = result.add(thirdValue);
        }
        result = result.multiply(BigInteger.valueOf(4));
        return result;

    }
}