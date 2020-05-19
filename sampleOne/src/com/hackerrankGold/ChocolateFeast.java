package com.hackerrankGold;

public class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(6,2,2));
    }
    static int chocolateFeast(int n, int c, int m) {
        int total=n/c;int count=0;
        System.out.println(total);
        while (total>=m){
            count++;
            total++;
           total=total-m;
        }
        return count+(n/c);

    }
}
