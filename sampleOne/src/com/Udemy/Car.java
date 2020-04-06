package com.Udemy;

public class Car {
    private boolean engine; private String name;
    private int cylinder;private int wheels;

    public Car(String name, int cylinder) {
        this.engine=true;
        this.wheels=4;
        this.name = name;
        this.cylinder = cylinder;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }
    public void startEngine(){
        System.out.println("car hasn't started.");
    }
    public void accelerate(){
        System.out.println("No car is started");
    }
    public void brake(){
        System.out.println("No break");
    }
}
class volkswagen extends Car{

    public volkswagen(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getCylinder() {
        return super.getCylinder();
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+" started");
    }

    @Override
    public void accelerate() {
        System.out.println("volkswagen speed up");
    }

    @Override
    public void brake() {
        System.out.println("volkswagen break");
    }
}
class Ford extends Car{

    public Ford(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford Speed Up");
    }
}





