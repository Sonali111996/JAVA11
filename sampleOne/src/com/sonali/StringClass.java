package com.sonali;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class StringClass {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        CharSequence newLine = "     l    ";
        //Join
        String x = String.join(newLine, "jfjfj", "hfbhjfjh", "njjfnfkj");
        System.out.println(x);
        //String Writer
        StringWriter sw=new StringWriter();
        PrintWriter pw=new PrintWriter(sw);
        pw.println("hhjjj");
        pw.println("asdf");
        pw.println("opasd");
        System.out.println(sw.toString());
        new String();//newly created String represents empty Character sequence
        byte[] bytes={};
        new String(bytes);//construct a new string of array of bytes using charset
        List<String> list=List.of();
        for (Object element:list) {
            System.out.println(element);
        }
    }


}
