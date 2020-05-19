package com.hackerrankGold;

import java.util.*;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        Integer[] arr={278 ,576 ,496 ,727 ,410 ,124 ,338 ,149 ,209 ,702 ,282 ,718 ,771 ,575 ,436};
        Integer[] arr1={1,7,2,4};
        List<Integer> s= Arrays.asList(arr);
        System.out.println(nonDivisibleSubset(4,s));

    }
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        List<Integer> test=new ArrayList<>(); int x=0;
        for(int i=0;i<s.size()-1;i++){
            int count=0;
            for (int j=i+1;j<s.size();j++){
                if((s.get(i)+s.get(j))%k!=0 && i!=j){
                    count++;
                    treeSet.add(s.get(i));
                    }
                }

            }
        System.out.println(treeSet.size());
        return treeSet.size();
        }


}
