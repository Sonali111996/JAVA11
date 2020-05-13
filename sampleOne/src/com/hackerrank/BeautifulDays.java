package com.hackerrank;

public class BeautifulDays extends Thread {
    public static void main(String[] args) {
        int p=beautifulDays(949488, 1753821 ,5005440);
        System.out.println(p);

    }
    static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;

        for(int x = i; x <= j; x++)
        {
            StringBuilder day = new StringBuilder(String.valueOf(x));
            int xReverse = Integer.parseInt(day.reverse().toString());

            if(Math.abs(x-xReverse) % k == 0)
            {
                beautifulDays++;
            }
        }
        return beautifulDays;


    }

}
