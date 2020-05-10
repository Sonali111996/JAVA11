package com.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class BonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        List<Integer> finalBill = bill;
        bill=bill.stream().filter(a->a!= finalBill.get(k)).collect(Collectors.toList());
       int count= bill.stream().reduce(0,(total,i)->total+i);
       int count1=finalBill.stream().reduce(0,(sum,j)->sum+j);
       count/=2;
       count1/=2;
      if(b==count){
          System.out.println("Bon Appetit");
      }
      if (b==count1){
          System.out.println(count1-count);
      }
    }
}
