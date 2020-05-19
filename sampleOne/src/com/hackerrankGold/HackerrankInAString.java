package com.hackerrankGold;

public class HackerrankInAString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }
    static String hackerrankInString(String s) {
        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                System.out.println(i);
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");
    }
}
