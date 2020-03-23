package com.sonali;

public class VarArity {
    public static void main(String[] args) {
     x().y();
        String s = "one";
        if (s.startsWith(s = "one"))
            System.out.println("oops");


    }
static  VarArity x(){
    System.out.println("Mount");
    return null;
}
static  void  y(){
    System.out.println(" & Deo");
}

}