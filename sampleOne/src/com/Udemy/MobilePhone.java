package com.Udemy;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> arrayList=new ArrayList<Contact>();
    private String myNumber;

    public MobilePhone( String myNumber) {
        this.arrayList = new ArrayList<Contact>();
        this.myNumber = myNumber;
    }
    private int findContact(Contact contact){
        return this.arrayList.indexOf(contact);
    }
   private int findContact(String name){
        for (int i=0;i<this.arrayList.size();i++){
            Contact contact=this.arrayList.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
   }
    public  boolean addNewContact(Contact contact){
      if (findContact(contact.getName())>=0){
          System.out.println("Already there");
          return false;
      }
      this.arrayList.add(contact);
      return true;
    }

//    public static ArrayList<Contact> addToList(Contact c) {
//       ArrayList<Contact> contacts=new ArrayList<Contact>();
//       for (int  i=0;i<contacts.size();i++){
//           if(c.getPhoneNumber()==contacts.get(i).getPhoneNumber()){
//               break;
//           }
//           else contacts.add(c);
//       }
//        System.out.println(contacts);
//       return contacts;
//    }


    public static void main(String[] args) {
        Contact c=new Contact("Sonu","9080786754");
        Contact p=new Contact("Willson","9080786543");
        Contact c1=new Contact("Sonu1","9080786754");
        MobilePhone mp=new MobilePhone("9090890978");
        mp.addNewContact(c);
        System.out.println(mp.arrayList);
        //addToList(c);addToList(p);
        //System.out.println(addToList(c));
    }
}


