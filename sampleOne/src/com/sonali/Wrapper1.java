package com.sonali;

public class Wrapper1 {
    int i1;
    Integer i2;
    public static void main(String[] args) {
        int sum=0;
        Wrapper1 w = new Wrapper1();
       try {
           sum = w.i1++ + w.i2++;
       } catch (Exception e) {
           System.out.println(w.i1+" "+w.i2);

       }
    }
}
