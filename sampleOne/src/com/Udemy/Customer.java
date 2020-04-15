package com.Udemy;

import java.util.ArrayList;

public class Customer {
    private String name;
   // private double x;
    private  ArrayList<Double> arrayList;

    public Customer(String name,double x) {
        this.name = name;
        this.arrayList=new ArrayList<Double>();
        addTransaction(x);
       // this.x=x;
    }

    public void addTransaction(double amount){
        this.arrayList.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getArrayList() {
        return arrayList;
    }
}
