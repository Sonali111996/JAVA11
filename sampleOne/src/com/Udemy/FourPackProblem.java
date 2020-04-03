package com.Udemy;

public class FourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) { //bigCount=5kilos, smallCount=1kilos
        int x=(bigCount*5)+smallCount;int y=smallCount;int p;
        int z=(bigCount*5)-goal;//5 3 24
        boolean b =false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        else if(z%5==0){return true;}
        else if(goal>x){return  false;}
        else if(goal==x){return true;}
        else {
            if (z==0){return true;}
           else{
           label:
              for (int i=0;i<=bigCount;i++){

                  y=goal-(i*5);
                  if(y<=smallCount && y>0){
                      b=true;
                      break ;
                  }
                else{  continue label;}

              }
           }

    }
        return  b;
}

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
       // System.out.println();
    }
}
