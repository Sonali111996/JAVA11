package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
    public static void main(String[] args) {
        List<List<Integer>> list =new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(11);list1.add(2);list1.add(4);
        list.add(list1);
        list1=new ArrayList<>(); list1.add(4);list1.add(5);list1.add(6);
        list.add(list1);
         System.out.println(list.get(1).get(1));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int row=arr.get(0).size(); int column=arr.size();  int digSum1=0;int digSum2=0;int diff=0;
        if(row==column){
            for(int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    if(i==j){
                        digSum1+=arr.get(i).get(j);
                    }
                    if(i+j==row-1){
                        digSum2+=arr.get(i).get(j);
                    }
                }
            }
            diff=digSum1-digSum2;
            if(diff<0){diff=0-diff;}
        }
        return diff;
    }






}
