package com.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

 interface Adder {
    String add(Function<String, String> f);
    void add(Consumer<Integer> f);
}

public class Test implements Adder {
   // private static Object Example;

    public static void main(String[] args) {



    }

    @Override
    public  String add(Function<String, String> f) {
        return f.apply("Welcome ");
    }

    @Override
    public void add(Consumer<Integer> f) {}
}


