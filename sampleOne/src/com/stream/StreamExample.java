package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String>  bingoList= Arrays.asList(
                "B12","B32","B11","G12","c34","A34");
        List<String> gNumbers=new ArrayList<>();
        bingoList.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("B"))
                .sorted()
                .forEach(System.out::println);
        Stream<String> input=Stream.of("A11","A22","A33","B11","B22");
        Stream<String> output=Stream.of("A22","A33","B11","B32","B44","B55");

        Stream<String> concatStream=Stream.concat(input,output);
        System.out.println("*****************__________*****************");
        concatStream.distinct()
                    .peek(System.out::println)
                    .count();
    }
}
