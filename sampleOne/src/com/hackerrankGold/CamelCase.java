package com.hackerrankGold;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
    static int camelcase(String s) {
        String[] strings=s.split("[A-Z]");
        return strings.length;

    }
}
