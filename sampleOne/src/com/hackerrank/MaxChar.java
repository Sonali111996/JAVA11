package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxChar {
    public static void main(String[] args) {
       String s="aabbccDC";
        List<List<Integer>> query = new ArrayList<>();
       getMaxCharCount(s,query);

    }
    public static void getMaxCharCount(String s,List<List<Integer>> queries) {
 int i=0;
 List<Integer> list= new  ArrayList<>();
 s=s.toLowerCase();
        while(i<s.length()) {
            int count=0;
            String v=String.valueOf(s.charAt(i));
            Pattern pattern = Pattern.compile(v);
            Matcher matcher =pattern.matcher(s);
           while (matcher.find()){
               count++;
           }
           list.add(count);
          //  System.out.println(s.charAt(i)+" : "+count);
           i++;

        }
        for(int j=0;j<queries.size();j++){
            queries.add(i,list);
            System.out.println(queries.get(i));
        }

    }
}
