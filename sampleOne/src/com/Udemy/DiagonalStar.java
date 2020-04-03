package com.Udemy;

public class DiagonalStar {
    public static void printSquareStar(int x){
        if(x<5){
            System.out.println("Invalid Value");
        }
       else {
           for(int i=0;i<x;i++){
               for (int j=0;j<x;j++){
                   if(i==0 || i==x-1){
                       System.out.print("*"); }
                   //System.out.println();
//                   else if(i==x-1){
//                       System.out.print("*");
//                   }
                   else if(i==j && i>0 && j>0){
                       System.out.print("*");
                   }
                   else if(i+j==x-1){
                       System.out.print("*");
                   }
                   else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }

       }
    }

    public static void main(String[] args) {
        printSquareStar(10);
    }
}


