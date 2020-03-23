package com.sonali;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.time.DateTimeException;
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
public class Exception2 {
    static void methodA() throws MyException{
       throw new MyException("A custom Exception");
    }
    static int methodB(int a)throws MyException{
      int result=1/a;
      methodA();
      return result;
    }
    public static void main(String[] args) {
        try {
            String out="The result is"+methodB(0);
            System.out.println(out);
        }
        catch (MyException e){
            System.out.println(e);
        }
    }
}
