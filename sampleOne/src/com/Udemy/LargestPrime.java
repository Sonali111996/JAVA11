package com.Udemy;
public class LargestPrime {
 public static int getLargestPrime(int number){
     int i = 0,factor2 = 0;int temp=number;
     if(number<=0){return -1;}
     else {
         for (i = 2; i <= temp; i++) {
             //System.out.println(i);
             if (temp % i == 0) {
                 temp /= i;
                 System.out.println(i);
                 i--;
                // System.out.println(i);
             }
         } return i;
     }

     //Read more: https://javarevisited.blogspot.com/2015/03/how-to-find-largest-prime-factor-of.html#ixzz6IYKoXF8u


 }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(35));
    }
}
