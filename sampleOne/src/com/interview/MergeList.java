package com.interview;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {

    }
    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            for (int j=0;j<b.size();j++){
                if(a.get(i)==b.get(j)){
                    list.add(j);
                    list.add(i);
                }
                list.add(j);

            }
            list.add(i);
        }
        return list;
    }




}
