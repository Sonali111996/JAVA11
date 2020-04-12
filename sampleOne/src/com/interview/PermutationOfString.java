package com.interview;

public class PermutationOfString {
    public static void main(String[] args) {
        String s="abc";
        char[] arr=s.toCharArray();
        recursiveCall(arr);
        int x=factorial(arr);
    }
    public static int permute(char[] s,int count) {
       // int count = 0;
        for (int i = 1; i < s.length; i++) {
            char temp = s[i];
            s[i] = s[i - 1];
            s[i - 1] = temp;
            count++;
            System.out.println(count);
            System.out.println(s);
        }
        return count;
    }
    public static void recursiveCall(char[] arr){
        int count=0;
        int x=factorial(arr);
        while(count<=x-2){
           count= permute(arr,count);
        }
    }
    public static int factorial(char[] s){
        int x=1;int i=1;
        while(i<=s.length){
            x*=i;
            i++;
        }
        return x;
    }
}
