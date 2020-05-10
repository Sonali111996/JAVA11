package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BreakingRecords {
    public static void main(String[] args) {

    }
    static int[] breakingRecords(int[] scores) {

        AtomicInteger count = new AtomicInteger();
        AtomicInteger countOne = new AtomicInteger();
        int first = scores[0];

        ArrayList<Integer> scoresList = IntStream.of(scores).boxed().collect(Collectors.toCollection(ArrayList::new));

        scoresList.stream().reduce(first, (best,val)-> {
            if(val>best){
                count.incrementAndGet();

                best = val;
            }
            return best;
        });

        scoresList.stream().reduce(first, (worst,val)-> {
            if(val<worst){
                countOne.incrementAndGet();
                worst = val;
            }
            return worst;
        });

        return new int[]{count.get(), countOne.get()};

    }



}