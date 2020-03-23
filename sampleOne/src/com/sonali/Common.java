package com.sonali;

public class Common {

    static int num;
   // String base = "1";
    //String x = "ab";

    void print(short a) {
        System.out.println("short");
    }

    void print(Integer ...a) {
        System.out.println("Integer");
    }

    void print(int[] a) {
        System.out.println("Arity Integer");
    }
    void print(Long ...a) {
        System.out.println("Long");
    }

    void print(Double ...a) {
        System.out.println("Double");
    }

    void print(Float ...a) {
        System.out.println("Float");
    }


    /*public Common() {
        String base = "2";
    }

    {
        String base = "3";
    }

    String sc = base;
*/
    public static void main(String[] args) {
         num=2;

        Common c = new Common();
        Common d=new Common();
        Common e=c;
        d=e;
        if(c!=null){
             int num=2;
        }
        c.print(new int[]{19,1});
        //c.print((float) 1.2,2,3);

    /*    System.out.println(c.sc);
        String s = "Pa ma pa";
        int ind1 = s.indexOf("p");
        System.out.println(ind1);
        int ind2 = s.indexOf('a', ind1);
        System.out.println(ind2);*/

    }
}
