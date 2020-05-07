package com.interview;

import java.time.Clock;

public class Frescoplay {
    public static void main(String[] args) {
        final Clock clock=Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
    }
}
