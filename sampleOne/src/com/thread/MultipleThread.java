package com.thread;
import static com.thread.ThreadColor.*;
public class MultipleThread {
    public static void main(String[] args) {
        CountDown countDown=new CountDown();
      // CountDown countDown1=new CountDown();
        CountDownThread t1=new CountDownThread(countDown);
        t1.setName("Thread 1");
        CountDownThread t2=new CountDownThread(countDown);
        CountDownThread t3=new CountDownThread(countDown);
        t2.setName("Thread 2");
        t1.start();
        t2.start();t3.start();

    }

}
class CountDown{
  private   int i;
    public  void switchCase(){

        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color=ANSI_CYAN;
                break;
            case "Thread 2":
                color=ANSI_RED;
                break;
            default:
                color=ANSI_GREEN;
        }
//       synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + " : i " + i);
       //     }
        }
    }
}

class CountDownThread extends Thread{
    private CountDown threadCountDown;

    public CountDownThread(CountDown threadCountDown) {
        this.threadCountDown = threadCountDown;
    }

    @Override
    public void run() {
     threadCountDown.switchCase();
    }
}
