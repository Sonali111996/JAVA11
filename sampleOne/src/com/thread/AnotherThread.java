package com.thread;

import static com.thread.ThreadColor.ANSI_PURPLE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Interruption during sleeping");
            return;
        }
        System.out.println(ANSI_PURPLE+"Hello from another thread   "+currentThread().getName());
    }
}
