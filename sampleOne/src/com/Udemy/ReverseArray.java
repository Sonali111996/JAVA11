package com.Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static void reverseArray(int[] arr) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Elements are :");

        int[] temp=new int[arr.length];
        int i=0,j=arr.length-1;
        while(i<arr.length){
            temp[j]=arr[i];
            System.out.print(i+" ="+arr[j]+" ");
            i++;j--;
        }
    }
    private static void reverseAnotherMethod(int[] arr){
        int max=arr.length-1;
        int halfLength=arr.length/2;
        for (int i=0;i<halfLength;i++){
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            max--;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,1,4,3,1};
        reverseAnotherMethod(arr);
        System.out.println(Arrays.toString(arr));
    }
}
