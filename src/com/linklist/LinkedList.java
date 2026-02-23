package com.linklist;

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


    //===== Add In LinkedList (ADD FIRST) =====
    public void addFirst(int data) {
        // create new Node
        LinkedList.Node newNode = new LinkedList.Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //newNode next point to old node nead
        newNode.next = head;
        // head = newNord head
        head = newNode;
    }

    //===== Add In LinkedList (ADD LAST) =====
    public void addLast(int data) {
        // create new Node
        LinkedList.Node newNode = new LinkedList.Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // old tail point ot new newNord
        tail.next = newNode;
        // tail is now newNord
        tail = newNode;
    }

    // ===  ADD the new node in the middle =====
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        LinkedList.Node newNode = new LinkedList.Node(data);
        size++;
        LinkedList.Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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
    public void removeLast(){
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

    // ====== PRINT THE LINKELIST ======
    public  void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        LinkedList.Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null" + ", Size : "+ size);
    }

    // ====== SEARCH THE LINKELIST ITERATIVE METHOD ======
    public  static void itrSearch(LinkedList list, int key){
        Node temp= head;
        if( head== null){
            System.out.println("List is empty");
        }
        int i=0;
        while(temp!=null){
            if (temp.data == key){
                System.out.println(temp.data + " is found at : " + i);
                break;
            } else if (temp.next == null){
                System.out.println("Not found");
            }
            temp=temp.next;
            i++;
        }
    }

    // ====== SEARCH THE LINKELIST RECURSIVE METHOD ======
    public int healper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idex = healper(head.next, key);
        if(idex == -1){
            return -1;
        }
        return idex+1;
    }
    public int recSearch( int key){
        return healper(head, key);
    }


    // ====== REVERSE A LINKELIST ITERATIVE METHOD ======
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }



    static void main(String[] args) {
        LinkedList list = new LinkedList();

        //========= Adding element in Linked List ========
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.add(2,9);
        list.print();


        // ========= Remove element in Linked List =========
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();

        // ========= Search element in Linked List =========
        list.itrSearch(list, 9);
        System.out.println(list.recSearch(9));

        // ========= Reverse a Linked List =========
        list.reverse();
        list.print();


    }



}



