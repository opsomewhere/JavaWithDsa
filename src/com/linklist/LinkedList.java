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
    public static int size;

    //===== Add In LinkedList (ADD FIRST) =====
    public void addFirst(int data){
        // create new Node
        Node newNode = new Node(data);
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
    public void addLast(int data){
        // create new Node
        Node newNode = new Node(data);
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
    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ====== PRINT THE LINKELIST ======
    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // ====== REMOVE FIRST THE LINKELIST ======
    public int removeFirst(){
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
    public int removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        Node temp = head;
        int j=0;
        while(j < size){
            temp = temp.next;
            temp.next = null;
            tail = temp;
            size--;
            return temp.data;
        }
        return val;
    }



    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.add(2,9);

        System.out.println(size);
        list.print();
        list.removeFirst();
        list.print();
        System.out.println(size);

        list.removeLast();
        list.print();

    }
}



