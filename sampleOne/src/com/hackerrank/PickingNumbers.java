package com.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PickingNumbers {
    public static void main(String[] args) {
        Integer[] arr={1,2,2,3,1,2};
        List<Integer> a= Arrays.asList(arr);
        System.out.println(pickingNumbers(a));
    }

    public static int pickingNumbers(List<Integer> a) {
        int count=0;ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<a.size();i++) {
            int x=a.get(i)+1;
            if(Collections.binarySearch(a,x)>0) {

                arr.add(Collections.frequency(a,a.get(i))+Collections.frequency(a,x));
            }
        }
       count=arr.stream().max(Integer::compareTo).get();

        return count;
//        int count=0;
//        ArrayList<Integer> arr=new ArrayList<>();
//        Collections.sort(a);
//        Map<Integer,Long> mp=a.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        for(int i=0;i<mp.size();i++){
//            for (Integer key : mp.keySet()) {
//                if(Math.abs(key-key+1)<=1){
//                    arr.add((int) (mp.get(key)+mp.get(key+1)));
//                }
//            }
//            count=
//        return count;
    }
}
