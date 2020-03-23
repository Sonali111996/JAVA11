package com.sonali;

public interface Interface1 {
    void method();
}

class Test1 implements Interface1{
   public void method(){
        System.out.println("hhj");
    }
}
class Test3{
    void methodB(){
        System.out.println("hjkk");
    }
}

 abstract class Test2 extends Test3 implements Interface1{
    public abstract void methodB();
    public abstract  void method();
 }
