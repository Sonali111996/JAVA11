package com.Udemy;

import java.util.ArrayList;

public class GenericEx implements GenericInterface {
    String name;
    ArrayList al=new ArrayList();
    public GenericEx(String name) {
        this.name = name;
        al.add(this.name);
        addPlayer(al);
    }

    @Override
    public void addPlayer(ArrayList o) {
        System.out.println("Generic Example");
    }

    public String getName() {
        return name;
    }
}
