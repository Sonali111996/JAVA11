package com.hackerrank;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }
    static int viralAdvertising(int n) {
        int cumulative=0;
        int share=5;
        for(int i=1;i<=n;i++){
            int like=share/2;
            cumulative+=like;
            share=like*3;
        }
        return cumulative;

    }
}
