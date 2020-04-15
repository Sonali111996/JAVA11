package com.Udemy;

public class Floor {
 double width; double length;
     public  Floor(){}
    public Floor(double width, double length) {
         if(width<0 && length<0){this.width=0;this.length=0;}
         else if(width<0){this.width=0;this.length=length;}
         else if(length<0){this.length=0;this.width=width;}
         else{
        this.width = width;
        this.length = length;}
    }
    public double getArea(){
         return this.width*this.length;
    }
}
class Carpet{
    double cost;
    public Carpet(double cost) {
        if(cost<0){this.cost=0;}
        else{this.cost = cost;}
    }

    public double getCost() {
        return cost;
    }
}

class Calculator{
    Floor floor; Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        double x=floor.getArea()*carpet.getCost();
        return x;
    }
}









