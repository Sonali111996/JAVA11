package com.hackerrank;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:00:00AM"));
    }
    static String timeConversion(String s) {
        String[] strings=s.split(":");
        Pattern pattern=Pattern.compile("PM");
        Matcher matcher=pattern.matcher(s);
        if(matcher.find()){
            if(Integer.parseInt(strings[0])<12 && Integer.parseInt(strings[0])>1){
                int p=Integer.parseInt(strings[0])+12;
               strings[0]= String.valueOf(p);
               // System.out.println(strings[0]);
            }
        }
        Pattern pattern1=Pattern.compile("AM");
        Matcher matcher1=pattern1.matcher(s);
        if(matcher1.find()){
            if(Integer.parseInt(strings[0])==12){

                strings[0]= "00";
              //  System.out.println(strings[0]);
            }
        }
       s="";
      s=s.concat(strings[0]).concat(":").concat(strings[1]).concat(":").concat(strings[2]);
        System.out.println(s);
       // s=strings.toString();
        s=s.replace("PM","");
        s=s.replace("AM","");
        return s;
    }
}
