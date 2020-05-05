package com.hackerrank;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={2,9,0,5,12,7,1};
        countSwaps(a);
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);}

    }
    static void countSwaps(int[] a) {
        int temp;
        for (int j = 0; j < a.length; j++) {
            for (int i = 1; i < a.length/2; i++) {
                if (a[j] > a[i]) {
                     temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

    }
}
