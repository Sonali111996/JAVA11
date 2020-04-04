package com.Udemy;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
    int count=0; int sum=0; int avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
    while (sc.hasNextInt()) {
        ++count;
        //  boolean isInt=sc.hasNextInt();
        //  if(isInt){
        int a = sc.nextInt();
        sum += a;
        // }
        // else{
        sc.nextLine();
    }           if(count>0)
                avg= Math.round((float)sum/count);
                else{avg=0;}

        System.out.println("Sum :"+sum+" "+"Average : "+" "+avg);


    sc.close();

    }
}
