package com.sonali;

public class StaticExample {
    static String text="foo";

    public static void main(String[] args) {
        if(!text.equals("Foo")){
            String text="bar";
        }
        else {
            String text = "bazz";
        }
        System.out.println(text);
    }

}
