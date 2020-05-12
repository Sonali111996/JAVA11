package com.hackerrank;

public class MagicSquare {
    public static void main(String[] args) {
        int[] arr1={4,9,2}; int[] arr2={3,5,7}; int[] arr3={8,1,5};
        int[][] s={arr1,arr2,arr3};
        System.out.println(formingMagicSquare(s));
    }
    static int formingMagicSquare(int[][] s) {
        System.out.println(s.length);
        int[] arr=new int[s.length];
        int sum=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){
                sum+=s[i][j];
            }
            for (int k=0;k<arr.length/2;k++){
                arr[k]=sum;
                System.out.println(arr[k]);
                continue;
            }
            sum=0;

        }
        return 0;
    }
}
