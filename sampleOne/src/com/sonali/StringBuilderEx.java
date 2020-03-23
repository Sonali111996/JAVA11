package com.sonali;

public class StringBuilderEx {
    public static void main(String[] args) {
        boolean b1=new StringBuilder("hello").equals("hello");
        //boolean b2=new StringBuilder("he").append("llo").equals(new StringBuilder("hello"));
        boolean b3= new String("hello").strip().equalsIgnoreCase("hello");
        boolean b4=("he"+"llo").toUpperCase().equals("HELLO");
        boolean b5="heLLo".equalsIgnoreCase("HELLO");
        System.out.println(b1+" "+" "+""+b3+" "+b4+" "+b5);

    }
}
