package com.hackerrank;

public class DayOfProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2400));
    }

    static String dayOfProgrammer(int year) {
        StringBuilder sb=new StringBuilder();
        if(year%100==0){
            year=year/100;
        }if (year%4==0){
            return  sb.append("12.09.").append(year).toString();
        }

        sb.append("13.09.").append(year);


        return sb.toString();
    }
}
