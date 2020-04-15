package com.Udemy;

public class DigitSum {
    public static int sumDigit(int num){
        int sum=0;
        if(num>=10){
            while(num !=0){
                sum+=num%10;
                num=num/10;
            } return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(-234));
    }
}
