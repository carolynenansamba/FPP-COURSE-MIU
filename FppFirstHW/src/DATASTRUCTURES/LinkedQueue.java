package DATASTRUCTURES;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue {
    class Node{
        Object data;
        Node next;
        Node(Object item){ data = item;}
    }
    Node front,rear;
    int count;
    public void enqueue(Object item){
        Node p = new Node(item);
        if(front == null){
            front = rear= p;
            rear.next = null;
        }else if(front == rear){
            rear = p;
            front.next = rear;
            rear.next = null;
        }else{
            rear.next =p;
            rear = p;
            rear.next = null;
        }
        count++;
    }

    public Object dequeue(){
        if(isEmpty()){
            System.out.println("Q is empty");
            return null;
        }

        Object item  = front.data;
        count--;
        return item;
    }
    public boolean isEmpty(){
        return (front== null);
    }
    public Object peek(){return front.data;}
    public int size(){return count;}
    public void display(){
        Node p = front;
        System.out.println("Linked Q: ");
        if(p == null){
            System.out.println("empty ");
        }
        while(p!=null){
            System.out.println(p.data + " ");
            p =p.next;
        }
        System.out.println();
    }
}

       class LinkedQueueDemo{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(42);
        q.add(-3);
        q.add(17);
        System.out.println(q);
    }
}
