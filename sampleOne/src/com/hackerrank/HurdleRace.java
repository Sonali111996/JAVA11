package com.hackerrank;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HurdleRace {
    public static void main(String[] args) {
        String s="(896874jkdth)5378-672568";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while(m.find()) {
            System.out.print(m.group());
        }
    }
    static int hurdleRace(int k, int[] height) {

        int min_dose=0;
        int check=Arrays.stream(height).max().getAsInt();
        if(k < check){
            min_dose=check-k;
        }

      return min_dose;
    }
}
