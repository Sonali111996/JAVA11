package com.sonali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.stream.Collectors;

public class ListExamples {
    public static void main(String[] args) {
        List a=new ArrayList<>();
        a.add("w");
        List c= List.copyOf(a);
       // c.add(0,"o");
       // c.add(1,"j");
        System.out.println(c);





        List<Integer> li=new ArrayList<>(List.of(1,2));
        Object[] array= li.toArray(new Integer[0]);
        //System.out.println(array[0]+array[1]);

        List x=new ArrayList<>();
        x.addAll(List.of("A","B"));
        x.addAll(1,x);
        System.err.println(x.containsAll(x));
        x.add(3,"g");
        System.out.println(x);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        final CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<Integer>(list);
        for (Integer y : list2) {
            System.out.println(y);
            list2.remove(y);
        }
        System.out.println("List size " + list2.size());
        //list2 = new CopyOnWriteArrayList<>(list);

        List listOne = new ArrayList();
        listOne.add('A');
        listOne.addAll(1, list);
        int num = 0;
        //listOne.forEach(x-> System.out.print(x));
        while (num < 5) {
            if (num % 2 == 0) {
                continue;
            }

        }
        System.out.println(num);
    }

}

