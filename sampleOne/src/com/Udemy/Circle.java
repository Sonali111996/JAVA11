package com.Udemy;

public class Circle {
    private double radius;
    public Circle(double radius) {
        if(radius<0){this.radius=0;}
         else{ this.radius = radius;}
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
       // this.radius = super.getRadius();
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        double volume=super.getArea()*height;
        return volume;
    }

}

class Main1{
    public static void main(String[] args) {
        Circle c=new Circle(3.75);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        Cylinder cy=new Cylinder(5.55,7.25);
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        System.out.println(cy.getArea());
        System.out.println(cy.getVolume());
    }
}
