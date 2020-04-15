package com.sonali;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        while(list != null){
            list.add(new Random().nextInt()*1000);
            java.lang.Thread.sleep(200);
        }
    }
}
