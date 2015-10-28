package com.lekhoni.basic;

/**
 * Created by kuasha on 1/19/15.
 */
public class Queue {
    public static final int DefaultSize = 100;
    
    private int[] store;
    private int rear;
    private int front;
    private int itemCount = 0;
    
    public Queue(){
        store = new int[DefaultSize];
        itemCount = 0;
        rear = front = -1;
    }
    
    public Queue(int size){
        if(size < 1){
            throw new IllegalArgumentException("size must be larger than zero.");
        }
        
        store = new int[size];
        itemCount = 0;
        rear = front = -1;
    }
    
    public void enqueue(int data){
        if (itemCount >= store.length) {
            throw new IllegalStateException("queue is full");
        }
        
        rear++;
        if (rear == store.length) {
            rear = 0;
        }
        
        store[rear] = data;
        itemCount++;
    }
    
    public int dequeue(){
        if (itemCount < 1) {
            throw new IllegalStateException("queue is empty");
        }
        
        front++;
        if (front > store.length){
            front = 0;
        }
        
        int data = store[front];
        
        itemCount--;
        
        return data;
    }
    
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        int ret = queue.dequeue();
        System.out.println(ret);
        ret = queue.dequeue();
        System.out.println(ret);
        ret = queue.dequeue();
        System.out.println(ret);
        ret = queue.dequeue();
        System.out.println(ret);
    }
}
