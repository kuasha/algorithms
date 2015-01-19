package com.lekhoni.linkedlist;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Maruf Maniruzzaman on 1/19/15.
 */
public class LinkedList {
    Node head;

    public Node getHead(){
        return head;
    }

    public Node find(Object data){
        if(data == null){
            return null;
        }

        if(head == null || head.next == null){
            return null;
        }

        Node cur = head.next;
        while(cur != null){
            if(data.equals(cur.data)){
                return cur;
            }
            cur = cur.next;
        }

        return null;
    }

    public boolean insert(Node after, Node newNode) {
        if (newNode == null || after == null) {
            return false;
        }

        newNode.next = after.next;
        after.next = newNode;

        return true;
    }

    public boolean delete(Node toDelete){
        if(head == null  || head.next == null){
            return false;
        }

        Node cur = head;
        while(cur.next != null){
            if(cur.next == toDelete){
                break;
            }
            cur = cur.next;
        }

        if(cur.next == toDelete){
            cur.next = toDelete.next;
            return true;
        }

        return false;
    }

    public int getSize(){
        if(this.isEmpty()){
            return 0;
        }

        return 0;
    }

    public List<Node> toList(){
        return null;
    }

    public boolean isEmpty(){
        return (head == null || head.next == null);
    }
}
