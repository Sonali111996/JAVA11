package com.sonali;


public class AbstractExample {
    public static void main(String[] strings) {
      String x="";
        for (String string:strings) {
            x+=x.concat("").concat(string);

        }            System.out.println(x);

    }
}
