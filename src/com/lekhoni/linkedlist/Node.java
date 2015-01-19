package com.lekhoni.linkedlist;

/**
 * Created by Maruf Maniruzzaman on 1/19/15.
 */

public class Node {
    Object data;
    Node next;

    public Node(){
    }

    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
