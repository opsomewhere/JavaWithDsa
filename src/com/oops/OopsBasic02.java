package com.oops;

public class OopsBasic02 {
    public static void main(String[] args) {
        // ASESS MODIFIER 
        // [ private -  within class only]
        // default -  withn class, with package 
        // protected - within class, within pakage, outsideby pakage by sub clas
        // public -  within class, within package, outside package by sub class , out side package 

        BankAccount myBank = new BankAccount();
        myBank.userName = "Om Prakash";
        // myBank.userPAss = "abcde"; //  can't directly ascess
        myBank.setPASS("abcde");

    }

}

// Ascess Modifier
class BankAccount {
    public String userName;
    private String userPAss;

    public void setPASS(String pwd) {
        userPAss = pwd;
    }


}
