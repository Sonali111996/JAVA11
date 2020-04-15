package com.sonali;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hacker1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,-6,5,-2,3);
        int val = calculateVal(list);
        System.out.println(val);

    }

    private static int calculateVal(List<Integer> list) {
        Integer val = 0; Integer min=0 ;
        for(var item: list){
            if(min < val+item){
                if(min>val)
                min = val;
                val+=item;
            }else{
                val+=item;
                min = val;
            }
            System.out.println("Min: "+min+" Val: "+ val);
        }

        if(min>1){
            return 0;
        }else{
            return 1-min;
        }

    }
}
