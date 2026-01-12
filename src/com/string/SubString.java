package com.string;

public class SubString {

    public static String subString(String str, int start, int end) {
        String substr = "";
        for (int i = start; i <= end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "Hello World";

        //inbuil Function in java
        System.out.println(str.substring(0, 5));

        //method built by us
        System.out.println(subString(str, 0, 5));

    }
}
