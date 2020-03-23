package com.sonali;

public class OperatorAll {
    public static void main(String[] args) {
        int x=2,y=3;
        short b;
        boolean a=false;
        System.out.println(x^y); //XOR gate if x^x=0
        System.out.println(x++ + ++x); //(2->3->4) // x=4;
        System.out.println(x<<2); //Left Shift --> convert 2 to binary(100) --> shift left as (10000)-->2^4=16
        System.out.println(x>>2);//right shift -> 100-->001
        System.out.println(x>>>2);//same as above for +ve numbers : 100->001
        System.out.println(-2>>2);//010 -invert (101) ->101+1=110 -> 001 -> -1
        System.out.println(~y); // if +ve --> y=-(y+1) or -(y-1)
        System.out.println(!a);//boolean
        short p=10,q=10;
        p+=q; //inernally added ..so no error
      //  p=p+q; //externally added. Converted to int. Compailation error

    }

}
