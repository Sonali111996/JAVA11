package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTriplet {
    public static void main(String[] args) {

        long r = 3;
        List<Long> arr1 = new ArrayList<>();
        arr1.add(1l);
       // arr1.add(3l);
        arr1.add(3l);
        arr1.add(9l);
        arr1.add(9l);
        arr1.add(27l);
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
        long count = 0;
        long sum = 0;
        long z = arr.size();
        List<Long> arr1 = new ArrayList<>();
        if (arr.stream().allMatch(arr.get(0)::equals) && r == 1) {
            count = (z * (z - 1) * (z - 2)) / 6;
            sum = count;
            return sum;
        }
        arr1 = arr.stream().distinct().collect(Collectors.toList());
        if(r==1){
            for(int i=0;i<arr1.size();i++) {
                int p=Collections.frequency(arr,arr1.get(i));
                count += (p * (p - 1) * (p - 2)) / 6;
                sum=count;
            }
            return sum;
        }
        for (int i = 0; i < arr.size(); i++) { //1 3 9 9 27 81
            long r1=arr.get(i); long r2=r1*r; long r3=r2*r;
            if(Collections.binarySearch(arr,r2)>i && Collections.binarySearch(arr,r3)>arr.indexOf(r2)){
                count=Collections.frequency(arr,r1)*Collections.frequency(arr.subList(arr.indexOf(r2),arr.size()),r2)
                        *Collections.frequency(arr.subList(arr.indexOf(r3),arr.size()),r3);
                System.out.println("r1 :"+r1+"  r2: "+r2+"     r3 :  "+ r3);
                sum+=count;
            }
        }

        return sum;

    }







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


}
