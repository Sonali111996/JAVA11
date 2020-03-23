package com.sonali;

import java.util.Arrays;

interface  Foo{
    String name="FOO";
}

class  Bar implements  Foo{
    static  String name="kll";
}
public class InterfaceFinal extends Bar implements Foo {
    public static void main(String[] args) {
       // int[] c=new int[2]{0,1};
        String k="jrmlk:ljfj:ldjj";
         String[] arra=k.split(":",2);
        System.out.println(Arrays.toString(arra));
        Foo foo=new Bar();
        System.out.println(foo.name);
        //System.out.println(name);
    }
}
