package com.sonali;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1 {

    public static String type(Object obj) {
        if (obj instanceof Integer) {
            return "Integer";
        } else if (obj instanceof String) {
            return "String";
        } else {
            return "Type not found";
        }

    }


    public static void main(String[] args) {


        System.out.println(type(45));
        System.out.println(type("hello"));
        System.out.println(type(45l));
        try {
            throw new FileNotFoundException();

        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("FileNotFoundException");
            }
            System.out.println(e.getMessage());

        }
    }

}
