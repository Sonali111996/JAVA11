package com.hackerrankGold;

public class SavePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(352926151 ,380324688 ,94730870));
    }

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int a = s+m-1;
        if(a>n){
            if(a%n==0){
                return n;
            }
            return a%n;
        }

        return a;
    }
}
