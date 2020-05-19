package com.hackerrankGold;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SherlockAndSquare {
    public static void main(String[] args) {
        System.out.println(squares(17,24));
    }
    static int squares(int a, int b) {
        return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
//        IntStream stream= IntStream.range(a,b+1);
//        int count= (int) stream.filter(p->(Math.sqrt(p))==(int)Math.sqrt(p)).count();
//
//        return count;

//        int count=0;int k=0;
//        for(int i=a;i<=b;i++){
//            if((Math.sqrt(i))==(int)Math.sqrt(i)){
//                k= (int) Math.sqrt(i);
//                count++;
//                System.out.println("count"+count);
//                break;
//            }
//        }
//        while ((int)Math.pow(k,2)<=b && count>0){
//            k++;
//            System.out.println((int)Math.pow(k,2));
//            if(Math.pow(k,2)<=b){
//                count++;
//            }
//        }



    }
}
