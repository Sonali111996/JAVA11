package com.sonali;

public class Outer {
    public static void main(String[] args) {
        Outer outer= new Outer();
        outer.print();
        Outer.Inner inner=outer.new Inner();
        inner.print();

    }
    public void print(){
        System.out.println("outer");
    }

    class Inner extends Outer{
        public void print(){
            System.out.println("inner");
        }

    }
}
