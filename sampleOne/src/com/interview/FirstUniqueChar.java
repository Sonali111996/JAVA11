package com.interview;

import java.util.Arrays;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String sb="Sonali Sethi";
        sb=sb.replaceAll("\\s","");
       // String s=sb.trim();
        char[] arr=sb.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        int i=0;
        Label1:
        while (i<arr.length){
            if(arr[i]!=arr[i+1] && i==0 ){
                System.out.println(arr[i+1]);
                break Label1;
            }
            else if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
                break Label1;
            }
            i++;
        }
    }
}
