package com.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;

public class Min_MaxSUM {
    public static void main(String[] args) {
        int[] arr={256741038 ,623958417,467905213 ,714532089, 938071625};
        System.out.println(Integer.MAX_VALUE);
        System.out.println("2548418794");
        miniMaxSum(arr);
    }
    static void miniMaxSum(int[] arr) {
        int len=arr.length;Arrays.sort(arr);
    if(len>=4){

        BigInteger minBig=new BigInteger("0");
        BigInteger maxBig=new BigInteger("0");
        for(int i=0;i<=3;i++){
            int x=arr[i];
            minBig=minBig.add(BigInteger.valueOf(x));
        }
        for(int i=len-1;i>=len-4;i--){
            int x=arr[i];
            maxBig=maxBig.add(BigInteger.valueOf(x));
        }
        System.out.println(minBig+" "+maxBig);

       }


    }
}
