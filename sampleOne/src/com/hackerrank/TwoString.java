package com.hackerrank;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwoString {
    public static void main(String[] args) {
        System.out.println(twoStrings12("aardvark"
                ,"apple"));
    }
    static String twoStrings(String s1, String s2) {
        String result="NO";
     if(s1.length()<=Math.pow(10,5) && s2.length()<=Math.pow(10,5)) {

             int count = 0;
         Label:
             for (int i = 0; i < s2.length(); i++) {
                 String str1=s2.substring(0,i+1);
                 String str2=s1.substring(0,i+1);
                 Pattern pattern = Pattern.compile(String.valueOf(str1.charAt(i)));
                 Matcher matcher = pattern.matcher(str2);
                 if(matcher.find()==false){
                     continue Label;
                 }
                 while (matcher.find()) {
                     count++;
                     if (count > 0) {
                         result= "YES";
                         break Label;
                     } else {
                         result="NO";
                         continue Label;
                     }
                 }
             }
         }
     else{
         result="NO";
     }
         return result;

        // return s1.matches(s2) ? "YES": "NO";

        //return Arrays.asList(s1.split("")).parallelStream().filter(x->s2.matches(".*"+x+".*")).findAny().isPresent() ? "YES": "NO";
    }
    static String twoStrings12(String s1, String s2) {
      //  int count = 0;
        if(Pattern.compile("["+s2+"]").matcher(s1).find())
            return "YES";
        else
            return "NO";

    }

}
