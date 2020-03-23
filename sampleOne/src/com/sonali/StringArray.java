package com.sonali;

import java.sql.Array;
import java.util.Arrays;

public class StringArray {
    String name;

    public StringArray(String... name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        StringArray s=new StringArray(null,null);
       //StringBuilder s1=new StringBuilder(s.name);
        System.out.println(s.name);
        String[] a1= new String[]{"1", "2", "3"};
        String[] a2=new String[]{"1","2","4"};
        String[] a3=null;
        String[] a4={};
        Object o1= Arrays.compare(a1,a2);
        System.out.println(o1);
        Object o2=Arrays.compare(a2,a1);
        System.out.println(o2);
        Object o3=Arrays.compare(a3,a4);
        System.out.println(o3);
        Object o4=Arrays.compare(a2,a3);

    }
}
