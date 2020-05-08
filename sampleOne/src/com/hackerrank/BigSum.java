package com.hackerrank;

import java.math.BigInteger;

public class BigSum {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
     for(int i=0;i<ar.length;i++){
         sum+=ar[i];
     }
    return sum;

    }

}
