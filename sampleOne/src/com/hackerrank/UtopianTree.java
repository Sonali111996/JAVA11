package com.hackerrank;

public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(0));
    }
    static int utopianTree(int n) {
      int growth=0;
//      if(n==0){
//          growth=1;
//        }
      for(int i=0;i<=n;i++){
          if(i%2!=0){
              growth=growth*2;
          }

          else growth+=1;
      }
      return growth;
    }
}
