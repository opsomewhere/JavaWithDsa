package com.linklist;

import com.linklist.function.AddLL;
import com.linklist.function.RemoveLL;
import static com.linklist.function.Print.print;

public class LinkedList {
    // ====== BASIC NODE STRUCTURE ======
    public static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //========= Adding element in Linked List =========
        AddLL.addFirst(1);
        AddLL.addFirst(2);
        AddLL.addFirst(3);
        AddLL.addLast(4);
        AddLL.add(2,9);

        // ========= Print elements of Linked List =========
        print();

        // ========= Remove element in Linked List =========
        RemoveLL.removeFirst();
        print();
        RemoveLL.removeLast();
        print();

    }
}



