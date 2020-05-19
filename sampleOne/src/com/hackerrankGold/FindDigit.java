package com.hackerrankGold;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDigit {
    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }
    static int findDigits(int n) {
        int count=0;
        String s=String.valueOf(n);
        Pattern pattern=Pattern.compile("[1-9]");
        Matcher matcher=pattern.matcher(s);
        while (matcher.find()){
            int x=Integer.valueOf(matcher.group());
            if(n%x==0){
                count++;
            }
        }

        return count;
    }

}
