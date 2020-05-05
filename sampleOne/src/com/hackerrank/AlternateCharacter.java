package com.hackerrank;

import java.util.regex.Pattern;

public class AlternateCharacter {
    public static void main(String[] args) {
        int x=alternatingCharacters("BBBBB");
        System.out.println(x);
    }
    static int alternatingCharacters(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder(s);
        for (int i=1;i<sb.length();i++) {
            if(Pattern.compile(String.valueOf(sb.charAt(i-1))).matcher(String.valueOf(sb.charAt(i))).find()){
                count++;
                sb.delete(i-1,i-1);
            }
            }

        return count;

    }

}
