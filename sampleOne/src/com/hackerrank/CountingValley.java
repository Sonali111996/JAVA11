package com.hackerrank;

public class CountingValley {
    public static void main(String[] args) {
        System.out.println(countingValleys(10,"DUDDDUUDUU"));
    }
    static int countingValleys(int n, String s) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='U'){
                if(++sum==0)
                    count++;
            }
            else sum--;
        }
        return count;
    }

}
