package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudent {
    public static void main(String[] args) {
        List<Integer> grades =new ArrayList<>();
        grades.add(73); grades.add(67); grades.add(38); grades.add(33);

        gradingStudents(grades);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
      for(int i=0;i<grades.size();i++){
         if(grades.get(i)>=38){
             int x=grades.get(i)/5;
             x=x+1;x=x*5;
             if(x-grades.get(i)<3) {
                 grades.set(i, x);
             }
         }
      }
      for (int x:grades){
          System.out.println(x);
      }
      return grades;
    }
}
