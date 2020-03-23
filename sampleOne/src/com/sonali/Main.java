package com.sonali;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
 public class Main  {
  private String s="sonalu";
     public String to1String()
     {
         return "Foo";
     }
     public static void main(String[] args) {
         Main m=new Main();
         m.s="jkjklkl";
         System.out.println(m.s);
         String x="JAVA";
         while(x.equalsIgnoreCase("JAVA")){
             x.toLowerCase();
         }
         System.out.println(x);
        int a=2;int b=3;
         Main t= (Main) new Test();
         System.out.println(t.to1String());
         //System.out.println("hh"+a/a);
     }
 }
 class Test extends Main{
     public String to1String()
     {
         return "Boo";
     }

        }