package com.hackerrankGold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("chillout"));
    }
    static String encryption(String s) {
        int len=s.length();String res="";
        double l=  Math.sqrt(len);

        char[][] arr=new char[len][len];


















//        List<String> list=new ArrayList<>();
//        for(int i=0;i<s.length()-l;i=i+l) {
//            list.add(s.substring(i, i+l));
//        }
//        list.add(s.substring(list.size()+l+1));
//       list.stream().forEach(System.out::println);
//        for(int i=0;i<list.get(0).length();i++) {
//            int x=i;
//           // list.stream().filter(a->a.length()==list.get(0).length()).map(a -> a.charAt(x)).forEach(System.out::print);
//            System.out.println();
//        }
//        System.out.println(res);
        return "0";

    }
}
