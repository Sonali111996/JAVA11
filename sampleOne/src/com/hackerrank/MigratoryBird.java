package com.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBird {
    public static void main(String[] args) {
        Integer[] ar = {1,2,3,4,5,4,3,2,1,3,4};
        List<Integer> arr= Arrays.asList(ar);
        System.out.println(migratoryBirds(arr));
    }
    static int migratoryBirds(List<Integer> arr) {
        int count=0;int i=1;int j=0;
      Map<Integer, Long> mp=  arr.stream()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      count= Math.toIntExact(arr.stream().distinct().map(a -> mp.get(a)).max(Long::compare).get());
        int finalCount = count;
        arr=mp.keySet().stream().filter(a->mp.get(a)== finalCount).collect(Collectors.toList());
        return arr.get(0);
    }
}
