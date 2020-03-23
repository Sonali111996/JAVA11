package com.sonali;

public class ConcatString {
    String concat1(String[] s1){ // for concat method the string need to be initialized.
        //s1= new String[]{"1", "2"};
        return s1[0].concat(s1[1]);
    }

    String concat2(String[] s2){
        return s2[0] +s2[1];
    }

    public static void main(String[] args) {
        ConcatString c=new ConcatString();
        String[] s={"1","2"};
        System.out.println((c.concat1(s))==(c.concat2(s)));
    }
}
