package com.hackerrankGold;

import java.util.Arrays;

public class IntroTutorial {

    static int introTutorial(int V, int[] arr) {
        int x= Arrays.binarySearch(arr,V);
        return x;
    }
}
