package com.hackerrank;

public class CatAndMouse {
    public static void main(String[] args) {
        System.out.println(catAndMouse(1,3,2));
    }
    static String catAndMouse(int x, int y, int z) {
        String s="";
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);
        System.out.println(a+" "+b);

        if(a==b){
            s="Mouse C";
        }
        else if(a<b){
            s="Cat A";
        }
        else{ s="Cat B";}
        return s;

    }
}
