package com.hackerrankGold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class PermutationEquation {
    public static void main(String[] args) {
        int[] p={4,3,5,1,2};
        permutationEquation(p);
    }
    static int[] permutationEquation(int[] p) {
        List<Integer> list= Arrays.stream(p).boxed().collect(Collectors.toList());
        list.add(0,0);
        int[] q=new int[p.length+1];
        q[0]=0;
        for(int i=1;i<list.size();i++){
            int x=i;
            q[i]=Arrays.stream(p).filter(a->list.get(list.get(a))== x).sum();
            System.out.println("i :  "+q[i]);

        }
        q=Arrays.copyOfRange(q,1,q.length);
        return q;
    }
}
