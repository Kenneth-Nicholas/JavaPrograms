package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; // the entire line is a statement, myVariable = 50 is an expression
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++; // A statement
        myVariable--; // A statement
        System.out.println("This is a test"); // the entire line is a statement.

        System.out.println("This is" +
                " another" +
                " still more.");    // These 3 lines makeup a single statement.

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
        // this is three statements in a single line, but bad coding style.

        // White space is the space between things in your code.
        // Indentation is indenting your code so that it's more readable
    }
}
