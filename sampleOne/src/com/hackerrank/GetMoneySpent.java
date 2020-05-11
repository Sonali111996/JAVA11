package com.hackerrank;

import javafx.scene.control.Label;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetMoneySpent {
    public static void main(String[] args) {
        int[] keyboard={3,1};
        int[] drives={5,2,8};
        System.out.println(getMoneySpent(keyboard,drives,10));
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int result=-1;int k=0;
        Arrays.sort(keyboards); Arrays.sort(drives);

       for(int i=keyboards.length-1;i>=0;i--){

           for (int j=drives.length-1;j>=0;j--){
                k=keyboards[i]+drives[j];
               if(k<=b){
                 arrayList.add(k);
               }
           }
       }
        Collections.sort(arrayList);result=arrayList.get(arrayList.size()-1);
       return result;
    }

    }
