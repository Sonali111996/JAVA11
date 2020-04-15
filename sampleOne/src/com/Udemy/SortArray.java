package com.Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static int[] getIntegers(int x){
        int[] arr=new int[x];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+x+" numbers to array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            //sc.nextLine();
        }
        sc.close();
        return arr;

    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortArray(int[] arr){
        int[] temp=new int[arr.length];
       Arrays.sort(arr);
       int j=0;int k=arr.length-1;
//       for (int i=(arr.length-1);i<=0;i--){
//           System.out.print(arr[i]+" ");
//       }
       while(j<arr.length){
           temp[j]=arr[k];
           System.out.print(j+" = "+temp[j]+" ");
           k--;
           j++;
       }
       //return temp;
    }
    public static void main(String[] args) {
        int[] arr=getIntegers(5);
        printArray(arr);
        sortArray(arr);

    }

}
