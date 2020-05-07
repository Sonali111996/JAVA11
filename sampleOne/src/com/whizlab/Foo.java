package com.whizlab;

public interface Foo {
     String x="rty";
     static void  field(){
         System.out.println(x);
    }

}

class Bar implements Foo{
 String x="bnm";
    public static void main(String[] args) {
        Foo foo =new Bar();
       Foo.field();
    }

}
