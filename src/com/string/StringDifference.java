package com.string;

public class StringDifference {
    public static void main(String[] args) {

        // Difference between Steing and new String
        String str = "Hello World";
        String str1 = "Hello World";

        String str3 = new String("Hello World");

        // Using if it will show that the sr1 & str2 are equal but both of them are not
        // equal to the str3
        // but using str.equla will show the the values under the
        // string are equal or not

        if (str1 == str3) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }
        // it gives correct ans about what inside the string
        if (str.equals(str3)) {
            System.out.println("Both are equal");
        }
    }
}
