package com.hackerrankGold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumDistance {
    public static void main(String[] args) {
        int[] a={1 ,2 ,3, 4 ,10};
        System.out.println(minimumDistances(a));

    }
    static int minimumDistances(int[] a) {
        int min=-1;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length-1;i++){
           for (int j=i+1;j<a.length;j++){
               if(a[i]==a[j]){
                   list.add(Math.abs(i-j));
               }
           }
        }
        Collections.sort(list);
        if(list.size()>0){
        min=list.get(0);}
        return min;
    }
}
