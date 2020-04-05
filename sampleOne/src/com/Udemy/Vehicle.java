package com.Udemy;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }
    public void steer(int direction){
      this.currentDirection+=direction;
        System.out.println("jkkjfh"+currentDirection);
    }
    public void move(int vel,int dir){
        currentDirection=dir;
        currentVelocity=vel;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

class Car extends Vehicle{

    public Car(String name, String size) {
        super(name, size);
    }
}
