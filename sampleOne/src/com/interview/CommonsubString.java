package com.interview;

import java.util.ArrayList;
import java.util.List;

public class CommonsubString {
    public static void main(String[] args) {
     List<String> s1= new ArrayList<>();
     s1.add("Hello");s1.add("Hi");
        List<String> s2= new ArrayList<>();
        s1.add("world");s1.add("bye");
        commonstring(s1,s2);

    }


    public static void commonstring(List<String> a, List<String> b){
        for (int i=0;i<a.size();i++){
            if(isCommon(a.get(i),b.get(i))){
                System.out.println("Yes");
                break;
            }
            else {
                System.out.println("No");
            }
        }

    }

    public static boolean isCommon(String s1,String s2){
        char[] c1=s1.toCharArray();char[] c2=s2.toCharArray();
        for(int i=0;i<c1.length;i++){
            for (int j=0;j<c2.length;j++){
                if(c1[i]==c2[j]){
                    return true;
                }
            }
        }
return false;
    }
}
