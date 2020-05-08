package com.hackerrank;

import java.util.Arrays;

public class AppleAndOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
     int x= (int) Arrays.stream(apples).parallel().filter(p->p>0 && a+p>=s && a+p<=t).count();
     int y= (int) Arrays.stream(oranges).parallel().filter(p->p<0 && b+p<=t && b+p>=s).count();
        System.out.println(x);
        System.out.println(y);
    }
}
