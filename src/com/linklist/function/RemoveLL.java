package com.linklist.function;
import com.linklist.LinkedList;

import static com.linklist.LinkedList.head;
import  static com.linklist.LinkedList.tail;
import  static com.linklist.LinkedList.size;

public class RemoveLL {
    // ====== REMOVE FIRST THE LINKELIST ======
    public static int removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =  0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // ====== REMOVE LAST THE LINKELIST ======
    public static void removeLast(){
        if(head == null){
            System.out.println("List is empty");
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;

        }
        LinkedList.Node prev = head;
        for (int i = 0; i < size-2 ; i++) {
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

    }
}
