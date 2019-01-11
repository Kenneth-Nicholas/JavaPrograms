package com.kennethnicholas;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {

        this("56789", 2.50, "Default name", "Default address", "Default phone");

        // if you try and create an object from this class and you don't give any parameters, these are the parameters that will be used when creating this object
        // Optional, not something you have to do, but there can be situations when you want to make sure that whenever a class is created all the fields get set.
        // using this to call another constructor. Always make sure that the this() statement must be the first line that's called in the constructor body.
        // this constructor calls the one below because we used the this() keyword to set default values.
        
        System.out.println("Empty constructor called");

    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {

        System.out.println("Account constructor with parameters called");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void depositFunds(double depositAmount) {

        this.balance += depositAmount;

        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);

    }

    public void withdrawFunds(double withdrawalAmount) {

        if(withdrawalAmount <= this.balance) {

            this.balance -= withdrawalAmount;

            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);

        } else {

            System.out.println("Only " + this.balance + " available. Withdrawal not processed");

        }

    }

    public String getNumber() {

        return this.number;

    }

    public void setNumber(String number) {

        this.number = number;

    }

    public double getBalance() {

        return this.balance;

    }

    public void setBalance(double balance) {

        this.balance = balance;

    }

    public String getCustomerName() {

        return this.customerName;

    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }

    public String getCustomerEmailAddress() {

        return this.customerEmailAddress;

    }

    public void setCustomerEmailAddress(String customerEmailAddress) {

        this.customerEmailAddress = customerEmailAddress;

    }

    public String getCustomerPhoneNumber() {

        return this.customerPhoneNumber;

    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {

        this.customerPhoneNumber = customerPhoneNumber;

    }

}
