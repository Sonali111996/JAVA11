package com.Udemy;

import java.util.ArrayList;

public class GenericCombaine<T extends GenericInterface>{
    String name;
   ArrayList<T> al=new ArrayList<>();
    public GenericCombaine(String name) {
        this.name=name;
        //this.al=
    }
    public  void add(T gx){
      this.al.add(gx);
    }
    public void print(ArrayList<T> al){
        for (int i=0;i<al.size();i++) {
            System.out.println(al.get(i));
        }
        for (T c:al) {
            System.out.println(c);
        }
    }

}
class Main3{
    public static void main(String[] args) {
        GenericCombaine genericCombaine=new GenericCombaine("Sonali");
        GenericEx gx=new GenericEx("Sonali");
        GenericEx1 gx1=new GenericEx1("ggfh");
        genericCombaine.add(gx);
        genericCombaine.add(gx1);


    }
}
