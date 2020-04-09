package com.sonali;

import java.util.Arrays;

public class LastUniqueChar {
    public static void main(String[] args) {
//        Song s1=new Song("Dil hi toh h",4.5);
//        Song s2=new Song("Thinking out loud",4.0);
//        // Song.printAlbum();

        String s = "namirta bethera";
        StringBuilder sb = new StringBuilder(s);

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        int i = arr.length - 1;
        while (i >= 0) {
            if (arr[i] != arr[i - 1] && i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            } else if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
            i--;
        }
    }
}
