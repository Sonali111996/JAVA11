package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        System.out.println(list.get(0));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int res1=1; int res2=0; int total=0;
        for(int i=0;i<=arr.size();i++){
            for (int j=0;j<=arr.get(i).size();j++) {
                if(i==j) {
                    res1 += arr.get(i).get(j);
                }
                if(i+j==arr.get(0).size()+1){
                    res2+=arr.get(i).get(j);
                }
            }

        }
        total=res1-res2;
        if(total<0){
            total=0-total;
        }


        return total;
    }

}
