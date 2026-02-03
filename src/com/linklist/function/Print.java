package com.linklist.function;

import com.linklist.LinkedList;
import static com.linklist.LinkedList.head;
import static com.linklist.LinkedList.size;

public class Print {
    public static void print(){
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

}
