package com.Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class ReadInteger {
    public static int[] readInteger(int count){
        int[] arr=new int[count];
        System.out.println("Enter integers :");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<count;i++) {
           int a=sc.nextInt();
           arr[i]=a;
        }
        sc.close();
        return arr;
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
//        Arrays.sort(arr);
//        int a=arr[0];
        return min;
    }

    public static void main(String[] args) {
       // readInteger(5);
        System.out.println(findMin(readInteger(5)));
    }
}
