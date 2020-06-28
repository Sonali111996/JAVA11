package com.datastructure;

public class Queue {
    static class Node{
        Node prev;
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;
    private int size=0;

    public void enqueue(int val){
        Node newNode=new Node(val);
        if(this.head==null){
            this.head=newNode;
            this.head.next=null;
        }
        else{
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

    public void dequeue(){
        if(this.head==null){
            System.out.println("queue is empty");
        }
        else {
            System.out.println(this.head.data + "   removed.");
            this.head = this.head.next;
        }

    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(9);
        queue.enqueue(0);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
}
