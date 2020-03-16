package com.sonali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.stream.Collectors;

public class ListExamples {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        final CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<Integer>(list);
        for (Integer x : list2) {
            System.out.println(x);
            list2.remove(x);
        }
        System.out.println("List size "+list2.size());
        //list2 = new CopyOnWriteArrayList<>(list);

        List listOne = new ArrayList();
        listOne.add('A');
        listOne.addAll(1, list);
        //listOne.forEach(x-> System.out.print(x));

    }
}
