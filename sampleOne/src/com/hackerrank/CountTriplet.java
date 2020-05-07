package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTriplet {
    public static void main(String[] args) {
        long r = 5;
        List<Long> arr1 = new ArrayList<>();
        arr1.add(1l);
       // arr1.add(3l);
        arr1.add(5l);
        arr1.add(5l);
        arr1.add(25l);
        arr1.add(125l);
        arr1.add(81l);
       // arr1.add(82l);


        System.out.println(countTriplets11(arr1, r));
    }

    static long countTriplets(List<Long> arr, long r) {
        long count =0;
        long z=arr.size();

        if (arr.stream().allMatch(arr.get(0)::equals) && r==1){
            count=(z*(z-1)*(z-2))/6;
            return count;
        }
        if(arr.stream().noneMatch(n->n%r==0 || n!=1)){
            return 0;
        }
        Collections.sort(arr);

       Map<Long,Integer> mp=new TreeMap<Long, Integer>();
       for(int i=0;i<arr.size();i++){
           if(arr.get(i)==1 || arr.get(i)%r==0) {
               mp.put(arr.get(i), Collections.frequency(arr,arr.get(i)));
           }
       }
       arr.removeAll(arr);

        for (Map.Entry mapElement : mp.entrySet()) {
            arr.add((Long) mapElement.getKey());
        }

        for (int i=0;i<arr.size();i++){
            long init=arr.get(i); long x=arr.get(i)*r;long y=arr.get(i)*r*r;
          //  System.out.println(mp.get(init)+" "+mp.get(x));
            if(arr.contains(init) && arr.contains(x) && arr.contains(y)) {
                count+=mp.get(init)*mp.get(x)*mp.get(y);
            }
        }

        
        return count;
    }
    //1 1  2 2 4 4  124 124 124 124 124 124

    static long factorial(long x) {
        if (x <= 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }


    static long countTriplets1(List<Long> arr,  long r) {
       // long count = 0;
       List<Long> items= arr.parallelStream().filter( x -> x==1 || x%r==0).collect(Collectors.toList());
       long setsize =  items.parallelStream().collect(Collectors.toSet()).size();

       if(items.size() != setsize) {
           return setsize - 2 + ((items.size() - setsize) * 2);
       }
       // return count;
        return setsize-2;

    }
    static long countTriplets11(List<Long> arr,  long r) {
        long count =0;
        long z=arr.size();

        if (arr.stream().allMatch(arr.get(0)::equals) && r==1){
            count=(z*(z-1)*(z-2))/6;
            return count;
        }

        arr=arr.stream().filter(n->n==1 || n%r==0)
                .flatMap(s->Stream.of(s))
                .collect(Collectors.toList());
        if(arr.size()==0){
            count=0;
        }
        if(r!=1){
            long sum= (long) ((1-Math.pow(r,3))/(1-3));
        }
        arr.stream().distinct().filter(a->a%r==0 && a%Math.pow(r,2)==0).forEach(System.out::println);


    //








//        for(int i=0;i<arr.size();i++) {
//            int temp = 0;
//            long init = arr.get(i);
//            long x = init * r;
//            long y = x * r;
//            if(Collections.frequency(arr,init)!=1) {
//                i=i+Collections.frequency(arr,init);
//            }
//            if (Collections.binarySearch(arr, x) >= 0 && Collections.binarySearch(arr, y) >= 0) {
//                count += Collections.frequency(arr, init) * Collections.frequency(arr, x) * Collections.frequency(arr, y);
//
//            }
//
//        }

        return count;
    }
}
