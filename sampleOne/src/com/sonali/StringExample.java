package com.sonali;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringExample {
    static CharSequence s= null;
    public static void main(String[] args) {
        String x = "Siddhartjh";

        String y=String.join(":","I","we","you");
        System.out.println(y);
        StringBuilder sb=new StringBuilder(x);

        List strings =new ArrayList<>(List.of("A","B"));
        Iterator iterator =strings.listIterator(1);
        strings.set(1,"C");
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }





       /* List<String> list=List.of("12","23",);
        String z=String.join('',list);
        System.out.println(z);
     // char[] a = x.toCharArray();

      /*  for(int j=0;j<sb.length(); j++){
            int count=0;
        for (int i = j+1; i < sb.length(); i++) {
            if (sb.charAt(j) == sb.charAt(i))
                count++;
            }
            if (count > 0)
               sb.deleteCharAt(j);
             }
        System.out.println(sb.charAt(sb.length()-1));*/
    }
}





