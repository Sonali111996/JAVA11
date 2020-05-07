package com.lambda;

import com.Udemy.Person;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class MainNew{
    public static void main(String[] args) {

//        AdderImpl adderImpl=new AdderImpl();
//        String r = adderImpl.add(a -> a + " lambda"); System.out.println(r);
    }
}


public interface AdderNew {
        String add(Function<String, String> f);
        void add(Consumer<Integer> f);
    }


    class AdderImpl implements AdderNew {

        @Override
        public  String add(Function<String, String> f) {
            return f.apply("Welcome ");
        }

        @Override
        public void add(Consumer<Integer> f) {}
    }


