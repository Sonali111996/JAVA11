package com.hackerrankGold;

import com.sonali.Array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheStick {
    public static void main(String[] args) {
        int[] arr={1 ,13 ,3, 8 ,14 ,9 ,4 ,4};
       int[] arr1= cutTheSticks(arr);
       Arrays.stream(arr1).forEach(System.out::print);

    }
    static int[] cutTheSticks(int[] arr) {

        int i=0;
        List<Integer> res= new ArrayList<>();
        while (arr.length>0) {

            Arrays.sort(arr);

            res.add(arr.length);
            System.out.println(" hifh:   "+res.get(i));
            int x = arr[0];
            arr = Arrays.stream(arr).filter(a -> a > 0).map(a -> a - x).toArray();
            arr=Arrays.stream(arr).filter(a->a>0).toArray();
            i++;

        }
        int[] res1=res.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return res1;

    }

}
