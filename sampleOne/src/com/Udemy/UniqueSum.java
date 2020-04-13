package com.Udemy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class UniqueSum {
     public static void UniqueSum(char[] arr){
         HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
         int count=1;
         for (int i=0;i<arr.length;i++){
             if(hm.containsKey(arr[i])){
                 int y=hm.get(arr[i])+1;
                 hm.replace(arr[i],y);
             }
             else{
                 hm.put(arr[i],count);
             }
         }
         for(int i=arr.length-1;i>=0;i--){
             if(hm.get(i)==1)
                 System.out.println(i+" "+hm.get(i));
             break;
         }
         for (Character key:
              hm.keySet()) {
             System.out.println("key = "+key+" value = "+hm.get(key));
         }

     }
//        Arrays.sort(arr);
//        int temp=arr.length;
//         for(int i=1;i<=(arr.length+1)/2;i++){
//             int x=checkTwoNumber(arr[i-1],arr[temp-1]);
//            System.out.println((i-1)+" = "+arr[i-1]+"  "+(temp-1)+" = "+arr[temp-1]);
//             if(x==0 && (i-1)!=temp-1){
//                 System.out.println(arr[i-1]+" and "+arr[temp-1]);
//                 continue;
//             }else if(x<0 || x>0) {
//                 i--;
//             }
//               temp--;
//         }
//     }
//     public static int checkTwoNumber(int x,int y){
//         if(x+y==11){
//             return 0;
//         }
//         else{
//             return -1;
//         }
//     }

    public static void main(String[] args) {
        String s="sonalisethi";
        char[] arr=s.toCharArray();
        //for (int i=0;i<)
        UniqueSum(arr);
    }
}
