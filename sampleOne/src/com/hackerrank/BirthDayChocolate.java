package com.hackerrank;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BirthDayChocolate {
    public static void main(String[] args) {
        Integer[] arr = {5, 2 ,2 ,1 ,5 ,3 ,2};
        List<Integer> s = Arrays.asList(arr);

//        final int d = 4;
//        final int m=3;
//
//
//        for(int i=0; i< s.size(); i++){
//            int tempSum=0;
//            for(int x=0; x<m && i+x < s.size(); x++){ 1 1 2 2 3
//                tempSum+=s.get(i+x);
//            }
//            for(int j=i+(m-1); j<s.size(); j++){
//
//                if(tempSum+s.get(j)==d){
//                   // System.out.println(s.get(i)+" "+ s.get(j));
//                }
//            }
//        }
        System.out.println(birthday(s, 9, 3));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {   // 1 2 1 3 2
          //  s.subList(i, i + m). stream().forEach(System.out::print);
         //   System.out.println("i : "+i+ " i+m  :"+(i+m));
            System.out.println(s.subList(i,i+m).toString());
            int p=s.subList(i, i + m). stream().reduce(0,(x,y)->(x+y));
            if (d ==p )
                count++;
        }
        System.out.println();
        return count;

   }
}
