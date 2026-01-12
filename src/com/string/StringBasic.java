package com.string;

import java.util.*;
public class StringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //char array
        char arr[] = {'a', 'b', 'c', 'd'}; 
        System.out.println(arr);

        //Method to create an String 
        //STRING ARE IMMUTABLE
        String str = "name";
        String str2 = new String("xyz");
        System.out.println(str+" , "+ str2);
       
        //Taking input from the user
        String name;
        name = sc.nextLine();
        System.out.println(name);
        
        // .length() function -- find length of the string
        System.out.println(name.length());

        sc.close();
    }
}
