package com.Udemy;

public class DecimalComparator {
    public static  boolean upDecimal(double x,double y){
        int p= (int) (x*1000);
        int q=(int) (y*1000);
        if(p==q){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(upDecimal(1.234,1.2341));
    }
}
