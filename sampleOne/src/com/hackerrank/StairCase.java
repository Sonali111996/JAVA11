package com.hackerrank;

public class StairCase {
    public static void main(String[] args) {
        staircase(6);
    }
    static void staircase(int n) {
        String str="*";
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
