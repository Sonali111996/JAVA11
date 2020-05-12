package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DesignerPDFviewer {
    public static void main(String[] args) {

    }
    static int designerPdfViewer(int[] h, String word) {
        int sum=0;
        List<Integer> list=new ArrayList<>();
        ArrayList<Integer> s = IntStream.of(h)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        for(int i=0;i<word.length();i++){
            int t=word.charAt(i)-'a';
            list.add(h[t]);
        }
        sum= Collections.max(list)*word.length();
        return sum;
    }

}
