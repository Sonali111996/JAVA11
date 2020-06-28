package com.datastructure;

import java.util.Arrays;

public class Stack {

    private static final int DEFAULT_CAPACITY=4;
    private int[] arr=new int[DEFAULT_CAPACITY];
    private int size=0;

    public void push(int val){
        if(size<arr.length && size>-1) {
            System.out.println(val + " pushed into stack at index " + (size));
            arr[size++] = val;
        }
        else if(size==-1){
            arr[++size]=val;
        }
        else {
            System.out.println("OVERFLOW");
        }
    }

    public void pop(){
         --size;
        if(size<0){
            System.out.println("UNDERFLOW");
        }
        else {
            System.out.println(arr[size] + " popped"+"   size  "+size);
        }

    }


    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(1);
        System.out.println("----------");
        stack.push(2);
        stack.push(1);

        stack.pop();
        stack.pop();
        stack.pop();


    }

}
