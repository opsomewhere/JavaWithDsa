package com.darray.arraylist;
import java.util.ArrayList;
public class Arrlist {
    public static void main(String[] args) {
        // ham static arrya ka size nahi badha sakte hai 
        // par arrlist ka sizr bad/ghat sakta hai 

        // arr list heap ke andar store hote hai 
        // arr list ke andar ob store karte hai , primitve data nahi 
        // iske process
        //     add
        //     remove
        //     modify
        //     delete/remove 
        //     iterate 

        //CREATING AN ARRAYLIST
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list1 = new ArrayList<String>();
        // ArrayList<Boolean> list2 = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Get Element 
        int element = list.get(0);
        System.out.println(element);

        //add element in btw
        // list.add(index of element, value);
        list.add(1, 5);
        System.out.println(list);

        // set element - kisi index par phele se rakha element ko change karna 
        list.set(0, 9);
        System.out.println(list);

        // delete / remove
        list.remove(3);
        System.out.println(list);

        // arry list ke size ke liye
        int  size = list.size();
        System.out.println(size);

        // loop 
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting 
        
    }
}
