package com.thread;


import static com.thread.ThreadColor.*;
import static java.lang.Thread.currentThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(ANSI_BLUE+"Hello from main method ");

        new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN+"hello from Anonomous class   "+currentThread().getName());
            }
        }.start();

        AnotherThread anotherThread=new AnotherThread();
        anotherThread.start();
        //anotherThread.interrupt();

       final Thread anotherrThread=new AnotherThread();
        anotherrThread.setName("**** Another Thread *****");
        anotherrThread.start();


        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(ANSI_RED+"Another thread terminated ,so I am running");
                    anotherrThread.join();
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED+"Couldn't wait");
                }
                System.out.println(ANSI_CYAN+"Hello from ruunable interface    "+ currentThread().getName());
            }
        });
        thread.start();

        System.out.println("Again Hello from main method");
    }
}
