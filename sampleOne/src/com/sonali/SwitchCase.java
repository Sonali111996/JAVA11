package com.sonali;

public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase s=new SwitchCase();
        String re=s.identifyNum(1);
        System.out.println(re);
    }
    String identifyNum(int num){
        switch (num){
            default:
                return "Zero";
            case 1:
                return "positive";
            case -1:
               return "negative";
        }
    }
}
