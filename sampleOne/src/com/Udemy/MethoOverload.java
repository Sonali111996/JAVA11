package com.Udemy;

public class MethoOverload {

    public static void secondsMinute(int m ,int s){
        if(m<0 || s<0 && s>59){
            System.out.println("Invalid Value");
        }

    }

}
