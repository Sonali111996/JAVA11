package com.Udemy;

public class Main {
    public static void main(String[] args) {
//        Printer printer=new Printer(24,true);
//        System.out.println(printer.addToner(79));
//        System.out.println(printer.printPages(90));
        //CAR:
        Ford f1=new Ford("Ford",3);
        System.out.println(f1.getName());
        System.out.println(f1.getCylinder());
        f1.startEngine();f1.accelerate();f1.brake();
        volkswagen v1=new volkswagen("volkswagen",6);
        v1.accelerate();

    }
}
