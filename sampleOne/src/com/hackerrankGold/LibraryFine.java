package com.hackerrankGold;

public class LibraryFine {
    public static void main(String[] args) {

    }
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine=0;
        if(y1==y2 && m1==m2){
            if(d1>d2){
                fine=Math.abs(d1-d2)*15;
            }
        }
        else if(y1==y2 && m1!=m2){
            if(m1<m2){
                fine=Math.abs(m1-m2)*500;
            }
        }
        else if(y1>y2){
            fine=10000;
        }

        return fine;
    }
}
