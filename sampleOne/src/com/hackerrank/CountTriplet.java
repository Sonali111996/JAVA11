package com.hackerrank;

import java.util.*;

public class CountTriplet {
    public static void main(String[] args) {
    long[] arr={1};
    long r=1;
    List<Long> arr1=new ArrayList<>(arr.length);
        arr1.add(3l); arr1.add(3l); arr1.add(3l); arr1.add(3l); arr1.add(3l); arr1.add(3l);
       // Integer.toBinaryString(100);

        System.out.println(countTriplets(arr1,r));
        System.out.println(factorial(arr.length-3));
    }

    static long countTriplets(List<Long> arr, long r) {
        Collections.sort(arr);int z=arr.size();
        int j=Collections.frequency(arr,1);
       for (j=j+1;j<arr.size();j++){
           if(arr.get(j)%r!=0){
               arr.remove(j);
           }
       }

        long count=0;
        if (arr.stream().allMatch(arr.get(0)::equals) && r==1){
            count=(z*(z-1)*(z-2))/6;
            return count;
        }

        for (int i=0;i<arr.size();i++) {
            long x = arr.get(i) * r;
            long y = arr.get(i) * r * r;
            if (Collections.binarySearch(arr,x)>=0 && Collections.binarySearch(arr,y)>=0 && x!=y) {
                if (Collections.frequency(arr, x) > Collections.frequency(arr, y)) {
                    count = count + Collections.frequency(arr, x);
                } else {
                    count = count + Collections.frequency(arr, y);
                }

            }
        }
        return count;
    }
    static long factorial(long x){
        if(x<=1){return 1;}
        return x*factorial(x-1);
    }

//
//    static long countTriplets1(List<Long> arr, long r) {
//        long count=0;
//        count=arr.parallelStream()
//                .filter(Collections.binarySearch(arr,n->arr.get(n)))
//
//
//
//    return count;


}
