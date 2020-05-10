package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisbleSumPairs {
    public static void main(String[] args) {
        int[] ar={1,3,2,6,1,2};
        System.out.println(divisibleSumPairs(6,3,ar));
    }
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        ArrayList<Integer> s = IntStream.of(ar)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0; i <= ar.length-1; i++) {
            for (int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])%k==0){
                    System.out.println("i :"+i+" j : "+j);
                    count++;
                }
            }

        }
        System.out.println();
        return count;


    }

}
