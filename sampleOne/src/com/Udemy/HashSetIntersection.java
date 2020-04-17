package com.Udemy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetIntersection {

    public static void main(String[] args) {
        String sonali="sonali is a good girl";
        String asu="Asutosh is a bad chutiya pila";
        String[] sonal=sonali.split(" ");
        String[] asut=asu.split(" ");
        Set<String> set1=new HashSet<String>();
        set1.addAll(Arrays.asList(sonal));
        Set<String>  set2=new HashSet<String>();
        set2.addAll(Arrays.asList(asut));
        Set<String>  set3=new HashSet<>(set1);
        set3.retainAll(set2);
        set2.addAll(set1);
        set2.removeAll(set3);
        for (String str: set2) {
            System.out.println(str);
        }
    }
}
