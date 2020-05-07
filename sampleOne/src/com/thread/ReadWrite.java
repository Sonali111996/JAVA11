package com.thread;

import java.util.Random;

class Run{
    public static void main(String[] args) {
        ReadWrite message=new ReadWrite();
        (new Thread(new Write(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

public class ReadWrite {
  private   String msg;
   private boolean empty=true;
    public synchronized void write(String inCmgMsg) throws InterruptedException {
        while(!empty){
          wait();
        }
        empty=false;
        notifyAll();
        this.msg=inCmgMsg;
    }
    public synchronized String read() throws InterruptedException {
        while (empty){
           wait();
        }
        empty=true;
        notifyAll();
        return msg;
    }
}
class Write implements Runnable{
 private ReadWrite writer;
 public Write(ReadWrite writer){
   this.writer=writer;
 }
    @Override
    public void run() {
     Random random=new Random();
      String[] strings={"abc","bcd","def","efg","fgh"};
      for (int i=0;i<strings.length;i++){
          try {
              writer.write(strings[i]);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          try {
              Thread.sleep(random.nextInt(2000));
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
        try {
            writer.write("finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Reader implements Runnable{
  private ReadWrite read;
  public Reader(ReadWrite read){
      this.read=read;
  }
    @Override
    public void run() {
        Random random=new Random();
        try {
            for(String latestMessage = read.read(); !latestMessage.equals("Finished");
                latestMessage = read.read()) {
                System.out.println(latestMessage);
                try {
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
