package com.lekhoni.basic;

/**
 * Created by kuasha on 1/19/15.
 */
public class Stack {
    private final int DefaultSize = 128;
    private int[] store;
    private int itemCount = 0;
    private int top;
    
    public Stack(){
        store = new int[DefaultSize];   
        top = -1;
    }
    
    public Stack(int size){
        store = new int[size];   
        top = -1;
    }
    
    public void push(int data){
        if(itemCount >= store.length){
            throw new IllegalStateException("stack is full");
        }
        
        store[++top] = data;
        itemCount++;
    }
    
    public int pop(){
        if(itemCount < 1){
            throw new IllegalStateException("stack is empty");
        }
        itemCount--;
        
        return store[top--];
    }
    
    public int peek(){
        if(itemCount < 1){
            throw new IllegalStateException("stack is empty");
        }
        return store[top];
    }
    
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(6);
        stack.push(11);
        int ret = stack.pop();
        System.out.println(ret);
    }
}
