package com.Udemy;

import java.util.Map;

public class NumberToWords {
    // write your code here
    public static int getDigitCount(int x) {
        int count = 0;
        if (x < 0) {
            return -1;
        } else if (x % 10 == x) {
            return 1;
        } else {
            while (x != 0) {
                x = x / 10;
                count++;
            }
            return count;
        }
    }

    public static void numberToWords(int number) {

        int r = 0;
        int reverseNumber;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            reverseNumber = reverse(number);
            int diffCount = getDigitCount(number) - getDigitCount(reverseNumber);

            Map<Integer, String> map = Map.of(1,"Zero");
            do {
                r = reverseNumber % 10;
                if (r == 0) {
                    System.out.println("Zero");
                } else if (r == 1) {
                    System.out.println("One");
                } else if (r == 2) {
                    System.out.println("Two");
                } else if (r == 3) {
                    System.out.println("Three");
                } else if (r == 4) {
                    System.out.println("Four");
                } else if (r == 5) {
                    System.out.println("Five");
                } else if (r == 6) {
                    System.out.println("Six");
                } else if (r == 7) {
                    System.out.println("Seven");
                } else if (r == 8) {
                    System.out.println("Eight");
                } else {
                    System.out.println("Nine");
                }
                reverseNumber = reverseNumber / 10;
            } while (reverseNumber != 0);

            while (diffCount > 0) {
                System.out.println("Zero");
                --diffCount;
            }
        }
    }


    public static int reverse(int c) {
        int a = 0, z = 0;
        if (c % 10 == c) {
            return c;
        } else {
            while (c != 0) {
                a = (c % 10);
                c = c / 10;
                z *= 10;
                z += a;
            }
            return z;
        }
    }

    public static void main(String[] args) {
        numberToWords(100);
    }
}