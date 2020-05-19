package com.hackerrankGold;

public class HalloweenSale {
    public static void main(String[] args) {
        System.out.println(howManyGames(100 ,19 ,1 ,180));
    }
    static int howManyGames(int p, int d, int m, int s) {
        int count=p;int i=0;
        if(p<=s) {
            i=1;
            while (count + m <= s && count+p<=s) {
                p -= d;
                System.out.println("p: "+p);
                i++;
                if (p >= m) {
                    System.out.println("p : " + p + "    count : " + count);
                    count += p;

                } else {
                    count += m;

                }
            }
        }
        System.out.println(count);
        return i;
    }
}
