// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if there are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
//
//
//
// Create a new class called VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intelliJ as setters won't be needed
// test and confirm it works.

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());

        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(50.0);

        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(51.0);

        bobsAccount.withdrawFunds(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");

        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();

        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);

        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Time", 100.00, "tim@email.com");

        System.out.println(person3.getName());

        System.out.println(person3.getEmailAddress());

    }

}
