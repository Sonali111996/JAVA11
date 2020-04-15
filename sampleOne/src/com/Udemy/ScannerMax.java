package com.Udemy;

import java.util.Scanner;

public class ScannerMax
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int  num=sc.nextInt();
        while(sc.hasNext()) {
          //int  num=sc.nextInt();
            sc.nextLine();
            num++;
        }
        System.out.println(num);

        sc.close();
    }
}
