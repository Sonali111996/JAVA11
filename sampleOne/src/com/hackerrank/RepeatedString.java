package com.hackerrank;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {
    // Complete the repeatedString function below.
    public static void main(String[] args) {
       long x= repeatedString("ababa",
               3);
        System.out.println(x);
    }
    static long repeatedString(String s, long n) {
        System.out.println(s.length());
        if(s.contains("a") && s.length()==1){
            return n;
        }
        if(n<s.length()){
            long count = 0;
            s=s.substring(0, (int) n);
            Pattern pattern = Pattern.compile("a");
            Matcher match = pattern.matcher(s);
            while (match.find()) {
                count++;
            }
            return count;
        }
        if (s != null && s.length()<=100 && s.length()>=1 && n<=Math.pow(10,12) && s.contains("a") ) {
                long modulo=0; long q;
                int count = 0;
                StringBuilder sb = new StringBuilder(s);

                s = sb.toString();
                Pattern pattern = Pattern.compile("a");
                Matcher match = pattern.matcher(s);
                while (match.find()) {
                    count++;
                }
            System.out.println("count :"+count);
                modulo=(n-sb.length())%sb.length();
//            if(modulo==0){
//                n=(n/s.length());
//                 return n;}


                q=(n-sb.length())/sb.length();

                long result= (q*count);
            System.out.println("Result of q no of strings "+result);
            System.out.println("MODULO :"+ modulo + "   Quescent : "+q);
           // sb.substring(0, (int) modulo-1);
            String p=s.substring(0, (int) modulo);
            System.out.println(p);
            Pattern pattern1 = Pattern.compile("a");
            Matcher match1 = pattern.matcher(p);
            while (match1.find()) {
                count++;
            }
               n=count+result;
        }
        else {
            n=0;
        }return n;
    }
}