package com.linklist;

public class LinkedList {
    // ====== BASIC NODE STRUCTURE ======
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //===== Add In LinkedList (ADD FIRST) =====
    public void addFirst(int data){
        // create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //newNode next point to old node nead
        newNode.next = head;
        // head = newNord head
        head = newNode;
    }

    //===== Add In LinkedList (ADD FIRST) =====



    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(3);
        list.addFirst(2);
        System.out.println(list.tail.next);




    }

}
