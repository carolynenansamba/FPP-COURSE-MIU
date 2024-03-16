package DATASTRUCTURES;

import java.util.Arrays;
import java.util.Stack;

public class ArrayStack {
    private Object a[];
    private int top;

    public ArrayStack(int n) {
        a = new Object[n];
        top = -1;
    }

    public void push(Object item) {
        if (top == a.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        a[top] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty ");
            return null;
        }

        Object item = a[top];
        top--;
        return item;
    }

    public Object peek(){//get top item stack
        if(isEmpty())
            return null;
        return a[top];
    }

    public boolean isEmpty(){
        return (top ==-1);
    }

    public int size(){
        return top+ 1;
    }

    public static void main(String[] args) {
        ArrayStack a  = new ArrayStack(5);
        a.push(5);
        a.push(4);
        a.peek();
        a.pop();
    }
}