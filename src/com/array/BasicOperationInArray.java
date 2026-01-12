package com.array;

import java.util.*;

public class BasicOperationInArray { 
    //  Create -> input -> output -> update 
    public static void update(int mark[]){
        for(int i = 0 ; i < mark.length; i++){
            mark[i]= mark[i]+1;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int size  = sc.nextInt();   //  input for the length of array
        int number[] = new int[size];  //Creating an array - the size of an array is given by user
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();   // element o index value of java   
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
            
        }

        // passing an array as argument meaning - 
        // in the function we had seen that whatever arguments are there in psMain 
        // they are copied and passed to some other function and whatever value is there in that is used in that function only.

        // but 

        // by reference method if the index value/ value of Array is change in another function it effects
        //  also shows on main function

        int mark[] = {97,98,99};
        update(mark);

        for(int i = 0 ; i < mark.length; i++){
            System.out.print(mark[i]+" ");
            
        }


        sc.close();
    }
    
}
