package com.hackerrankGold;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        extraLongFactorials(25);
    }
    static void extraLongFactorials(int n) {
        BigInteger bigInteger = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 1; i <= n; i++)
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));

        System.out.println(bigInteger);

    }
}
