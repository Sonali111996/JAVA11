package com.hackerrankGold;

public class JumpingOnCloud {
    public static void main(String[] args) {
        int[] c={1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        jumpingOnClouds(c,3);
    }
    static int jumpingOnClouds(int[] c, int k) {
        int energyConsumed = 0;
        int i = 0;
        do{
            if(c.length <= i+k){
                i = 0;
            }else{
                i = i + k;
            }
            energyConsumed += 1 + 2*c[i];
        } while(i != 0);
        System.out.println(100-energyConsumed);
        return 100 - energyConsumed;

    }
}
