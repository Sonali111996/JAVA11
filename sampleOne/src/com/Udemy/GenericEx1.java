package com.Udemy;

import java.util.ArrayList;

public class GenericEx1 implements GenericInterface {
    String name;
    ArrayList al=new ArrayList();
    public GenericEx1(String name) {
        this.name = name;
        this.al.add(this.name);
        addPlayer(al);
    }

    @Override
    public void addPlayer(ArrayList name) {
        System.out.println("Sonali");
    }
}
