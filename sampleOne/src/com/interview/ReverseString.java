package com.interview;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("rosalin behera");
        StringBuilder temp=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            temp.append(sb.charAt(i));
        }
        System.out.println(temp);
    }
}
