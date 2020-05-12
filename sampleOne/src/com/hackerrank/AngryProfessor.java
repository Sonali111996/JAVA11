package com.hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AngryProfessor {
    public static void main(String[] args) {
        int[] a={0,-1,2,1};
        System.out.println(angryProfessor(2,a));
    }
    static String angryProfessor(int k, int[] a) {
        StringBuilder sb=new StringBuilder();
       int x= (int) Arrays.stream(a).filter(b->b<=0).count();
        System.out.println("X : "+x);
       if(x>=k){
           sb.append("NO");
       }else {
           sb.append("YES");
       }
   return sb.toString();
    }
}
