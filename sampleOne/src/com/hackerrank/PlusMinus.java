package com.hackerrank;

import java.util.Arrays;

public class PlusMinus {
    static void plusMinus(int[] arr) {
      float x= (float) Arrays.stream(arr).filter(a->a<0).count();
      float y=(float) Arrays.stream(arr).filter(a->a>0).count();
      float z=  (float) Arrays.stream(arr).filter(a->a==0).count();
        System.out.printf("%.6f\n",(x/arr.length));
        System.out.printf("%.6f\n",(y/arr.length));
        System.out.printf("%.6f\n",(z/arr.length));

    }
}
