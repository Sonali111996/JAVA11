package com.hackerrank;

import java.util.Arrays;

public class BDAY_Candle {
    static int birthdayCakeCandles(int[] ar) {
      Arrays.sort(ar); int x=ar[ar.length-1];
       int num= (int) Arrays.stream(ar).filter(a->a==x).count();
       return num;
    }
}
