package com.oops;

import java.util.*;

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankClient client = new BankClient();

        System.out.println("===== BANK ACCOUNT CREATION =====");
        System.out.print("Enter your name: ");
        String clientName = sc.nextLine();

        System.out.print("Enter your age: ");
        int clientAge = sc.nextInt();

        System.out.print("Enter initial deposit amount: ");
        float clientAmount = sc.nextFloat();
        sc.nextLine(); // Consume newline

        client.setBasicClientInfo(clientName, clientAge, clientAmount);

        System.out.print("Create a 4-digit PIN: ");
        int pin = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter your phone number: ");
        String phoneNumber = sc.nextLine();

        client.setupAccount(pin, phoneNumber);
        client.printClientInfo();

        // Transaction menu
        boolean exit = false;
        while (!exit) {
            System.out.println("\n===== TRANSACTION MENU =====");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Account details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    float depositAmount = sc.nextFloat();
                    sc.nextLine(); // Consume newline
                    client.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    float withdrawAmount = sc.nextFloat();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter PIN: ");
                    int withdrawPin = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    client.withdraw(withdrawAmount, withdrawPin);
                    break;
                case 3:
                    System.out.print("Enter PIN: ");
                    int balancePin = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    client.checkBalance(balancePin);
                    break;
                case 4:
                    System.out.print("Enter current PIN: ");
                    int currentPin = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter new PIN: ");
                    int newPin = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    client.changePin(currentPin, newPin);
                    break;
                case 5:
                    System.out.print("Enter PIN: ");
                    int detailsPin = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    client.showAccountDetails(detailsPin);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}

class BankClient {
    String name;
    int age;
    float amount;
    private int pin;
    private String number;
    private String crn;
    private String accNo;
    private Date accountCreationDate;

    public void setBasicClientInfo(String name, int age, float amount) {
        this.name = name;
        this.age = age;
        this.amount = amount;
    }

    public void setupAccount(int pin, String phoneNumber) {
        this.pin = pin;
        this.number = phoneNumber;

        // Generate a random Customer Reference Number (CRN)
        this.crn = "CRN" + (10000 + new Random().nextInt(90000));

        // Generate a random Account Number
        this.accNo = "ACC" + (100000 + new Random().nextInt(900000));

        // Set account creation date
        this.accountCreationDate = new Date();

        System.out.println("\nAccount created successfully!");
        System.out.println("Your CRN: " + this.crn);
        System.out.println("Your Account Number: " + this.accNo);
    }

    void printClientInfo() {
        System.out.println("\n===== BASIC CLIENT INFORMATION =====");
        System.out.println("Client name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Current balance: $" + String.format("%.2f", amount));
    }

    public void deposit(float depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }

        amount += depositAmount;
        System.out.println("Deposit successful!");
        System.out.println("New balance: $" + String.format("%.2f", amount));
    }

    public void withdraw(float withdrawAmount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Transaction failed.");
            return;
        }

        if (withdrawAmount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }

        if (withdrawAmount > amount) {
            System.out.println("Insufficient balance. Transaction failed.");
            return;
        }

        amount -= withdrawAmount;
        System.out.println("Withdrawal successful!");
        System.out.println("New balance: $" + String.format("%.2f", amount));
    }

    public void checkBalance(int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Operation failed.");
            return;
        }

        System.out.println("Current balance: $" + String.format("%.2f", amount));
    }

    public void changePin(int currentPin, int newPin) {
        if (currentPin != pin) {
            System.out.println("Incorrect current PIN. Operation failed.");
            return;
        }

        if (newPin < 1000 || newPin > 9999) {
            System.out.println("PIN must be a 4-digit number.");
            return;
        }

        this.pin = newPin;
        System.out.println("PIN changed successfully!");
    }

    public void showAccountDetails(int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Operation failed.");
            return;
        }

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + number);
        System.out.println("CRN: " + crn);
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Creation Date: " + accountCreationDate);
        System.out.println("Current Balance: $" + String.format("%.2f", amount));
    }
}