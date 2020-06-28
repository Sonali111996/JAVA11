package com.datastructure;
public class LinkedList {
   static class Node{
       Node prev;
       Node next;
       int data;//89

       public Node(int data) {
           this.data = data;
       }
   }

   public Node head;//pointer 3
   public Node tail;//pointer 4
    private static int size=0;

    public void insert(int val){
        Node newNode=new Node(val);
        if(this.head==null){
            this.head=newNode;
            this.head.next=this.tail;
        }
        else {
            if(this.head.next==null){
                newNode.prev=this.head;
                this.head.next=newNode;
                this.tail=newNode;
            }
            else {
                this.tail.next=newNode;
                newNode.prev=this.tail;
                this.tail=newNode;
            }
        }
        size++;
    }

    public void completeTraverse(){
        Node node=this.head;
        while(node!=null){
            System.out.print(node.data+"  ");
            node=node.next;
        }
    }


    public int search(int val){
        int index=-1;
       Node temp=this.head;
       while(temp!=null){
           index++;
         //  System.out.println(temp.data);
           if(temp.data==val){
               break;
           }
               temp=temp.next;
       }
    return index;
    }

    public Node traverse(int givenIndex){
        int index=-1;
        Node temp=this.head;
        while(temp!=null){
            index++;
            if(givenIndex==index){
                break;
            }
            temp=temp.next;
        }
        return temp;
    }


    public void add(int val,int position){
        Node temp1=traverse(position-1);
        Node temp2=temp1.next;
        System.out.println("temp2  "+ temp2.data);
        Node node=new Node(val);
        temp1.next=node;
        node.next=temp2;
        temp2.prev=node;
        System.out.println();
        System.out.print(temp1.data+"  "+node.data+"  "+temp2.data);
        System.out.println();
    }

    public void delete(int val){
        int x=search(val);
        Node temp=traverse(x);
        Node temp1=temp.prev;
        Node temp2=temp.next;
        temp1.next=temp2;
        temp2.prev=temp1;
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(70);list.insert(23);list.insert(98);list.insert(56);
        list.add(34,3);
        System.out.println("**********Complete Traverse*********");
        list.completeTraverse();
        list.delete(98);
        list.completeTraverse();
    }

}
