package com.Udemy;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double distance= Math.sqrt((this.x)^2+(this.y)^2);
        return distance;
    }
    public double distance(int x,int y){
        int temp1=this.x-x; int temp2=this.y-y;
//        if(temp1<0 && temp2<0){temp1=0-temp1;temp2=0-temp2;}
//        else if(temp1<0){temp1=0-temp1;}
//        else if(temp2<0){temp2=0-temp2;}
//        else {temp1=temp1;temp2=temp2;}
        double distance=  Math.sqrt((temp1*temp1)+(temp2*temp2));
        return distance;

    }
    public double distance(Point p){

     double distance= Math.sqrt((this.x-p.getX())^2+(this.y-p.getY())^2);
     return distance;
    }

    public static void main(String[] args) {
        Point p=new Point();
        System.out.println(p.distance(-1,-1));
    }
}
