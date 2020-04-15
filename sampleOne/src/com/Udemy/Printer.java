package com.Udemy;

public class Printer {
    private int tonerLevel;
    private int PagesPrinted;
    private boolean duplexPrint;

    public Printer( int tonerLevel, boolean duplexPrint) {
        this.tonerLevel = tonerLevel;
      if(tonerLevel>=0 && tonerLevel<=100){ this.tonerLevel = tonerLevel;}
      else this.tonerLevel=-1;
        this.duplexPrint = duplexPrint;
    }
   public int addToner(int toner){
        if(toner>=0 && toner<=100){
            if(this.tonerLevel+toner<=100){
              return   this.tonerLevel+=toner;
            }
            else return -1;
        }
        else return -1;
   }
 public int printPages(int pages){
        if(this.duplexPrint){
           return pages/=2;
        }
        else
            return this.PagesPrinted+=pages;

 }

}

