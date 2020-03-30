package com.Udemy;

public class SpeedConverter {
    public static long toMileConverter(double x){
        if(x<0){
            return -1;
        }
        return Math.round(x/1.609);
    }

    public static void main(String[] args) {
        System.out.println(toMileConverter(1.5)+" "+toMileConverter(10.25)+" "+toMileConverter(-5.6)+" "+toMileConverter(25.9));
    }
}
