package com.Udemy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExercise {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        addInorder(linkedList,"Berhampur");
        addInorder(linkedList,"Chatrapur");
        addInorder(linkedList,"Bhabinipur");
        addInorder(linkedList,"Bhabinipur");
        addInorder(linkedList,"Chamakhandi");


        //linkedList.add("Chatrapur");
        //linkedList.add("Bhabinipur");
       // printList(linkedList);
       // addInorder(linkedList,"Chamakhandi");
        printList(linkedList);

    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println("places "+iterator.next());
        }
    }
    public static boolean addInorder(LinkedList<String> linkedList,String cityName){
       // Iterator<String> iterator=linkedLis.;
        //boolean b=false;
        ListIterator<String> iterator=linkedList.listIterator();
        while (iterator.hasNext()){
            int x=iterator.next().compareTo(cityName);
            if(x==0){
                System.out.println(cityName+" already exist in the list");
                return false;
            }
            else if(x>0){
                iterator.previous();
                iterator.add(cityName);
                return true;
            }
            else if(x<0) {
                //iterator.add(cityName);
               // return true;
            }
            //linkedList.add(cityName);//b= true;
        }
        iterator.add(cityName);
        return true;
       // return b;

    }
}
