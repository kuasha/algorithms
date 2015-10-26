package com.lekhoni.basic;

/**
 * Created by kuasha on 1/19/15.
 */
public class Queue {
    public static final int DefaultSize = 100;
    
    private int[] store;
    private int rear;
    private int front;
    
    public Queue(){
        store = new int[DefaultSize];
        rear = front = -1;
    }
    
    public Queue(int size){
        if(size < 1){
            throw new IllegalArgumentException("size must be larger than zero.");
        }
        
        this.store = new int[size];
        rear = front = -1;
    }
    
    public void enqueue(int data){
        
    }
    
    public int dequeue(){
        return 0;
    }
    
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(1);
        int ret = queue.dequeue();
    }
}
