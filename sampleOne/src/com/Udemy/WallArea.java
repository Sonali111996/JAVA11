package com.Udemy;

public class WallArea {
   private double width;
   private double height;

    public WallArea(double width, double height) {
        if(width<0 && height<0){this.width=0;this.height=0;}
        else if(width<0){this.width=0;this.height=height;}
        else if(height<0){this.height=0;this.width=width;}
        else{
        this.width = width;
        this.height = height;}
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            this.width=0;}
        else { this.width = width;}
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){this.height=0;}
        else {this.height = height;}
    }
    public double getArea(){
        return height*width;
    }

    public static void main(String[] args) {
        WallArea w=new WallArea(-1.5,-1.5);
        System.out.println(w.getArea());
        w.setHeight(-1.5);
        System.out.println(w.getHeight());
        System.out.println(w.getWidth());
        System.out.println(w.getArea());



    }
}
