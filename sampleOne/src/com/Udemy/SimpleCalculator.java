package com.Udemy;

public class SimpleCalculator {
  private   double fistNumber;
  private   double secondNumber;

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFistNumber() {
        return fistNumber;
    }

    public void setFistNumber(double fistNumber) {
        this.fistNumber = fistNumber;
    }
    public double getAdditionResult(){
        return fistNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return secondNumber-fistNumber;
    }
    public double getMultiplicationResult(){
        return fistNumber*secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber==0){return 0;}
        return fistNumber/secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator sc=new SimpleCalculator();
        sc.setFistNumber(5.0);
        sc.setSecondNumber(4);
        System.out.println(sc.getAdditionResult());
        System.out.println(sc.getSubtractionResult());
        sc.setFistNumber(5.25);
        sc.setSecondNumber(0);
        System.out.println(sc.getMultiplicationResult());
        System.out.println(sc.getDivisionResult());



    }



}

