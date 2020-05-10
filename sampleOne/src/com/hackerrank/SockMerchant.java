package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SockMerchant {
    public static void main(String[] args) {
        int[] ar={4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5};
        System.out.println(sockMerchant(9,ar));
    }

    static int sockMerchant(int n, int[] ar) {
        int count=0;
        ArrayList<Integer> list = IntStream.of(ar).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> finalList = list;
        ArrayList<Integer> finalList1 = finalList;
        list= (ArrayList<Integer>) finalList.stream().filter(a->(Collections.frequency(finalList1,a))>=2)
                .collect(Collectors.toList());
        Collections.sort(list);
        finalList= (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        list.stream().forEach(System.out::println);
        for(int i=0;i<finalList.size();i++){
            count+=Collections.frequency(list,finalList.get(i))/2;
        }
       return count;
    }
}
