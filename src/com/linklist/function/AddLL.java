package com.linklist.function;

import com.linklist.LinkedList;
import static com.linklist.LinkedList.head;
import  static com.linklist.LinkedList.tail;
import  static com.linklist.LinkedList.size;

//===== Add In LinkedList (ADD FIRST) =====
public class AddLL {
    public static void addFirst(int data){
        // create new Node
        LinkedList.Node newNode = new LinkedList.Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //newNode next point to old node nead
        newNode.next = head;
        // head = newNord head
        head = newNode;
    }

    //===== Add In LinkedList (ADD LAST) =====
    public static void addLast(int data){
        // create new Node
        LinkedList.Node newNode = new LinkedList.Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // old tail point ot new newNord
        tail.next = newNode;
        // tail is now newNord
        tail = newNode;
    }

    // ===  ADD the new node in the middle =====
    public static void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        LinkedList.Node newNode = new LinkedList.Node(data);
        size++;
        LinkedList.Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
