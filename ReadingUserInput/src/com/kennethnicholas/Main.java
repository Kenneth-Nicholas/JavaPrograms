package com.kennethnicholas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // new creates a new object of type scanner, an instance of the Scanner class.
        // Can create as many instances of the Scanner class as we need.
        // On a new line giving it a different name than scanner.

        // Whenever we enter a number from the keyboard, we press enter, which ends the line.
        // After a next int, call nextLine again without assigning it to a variable to prevent nextInt from skipping a String input after nextInt.

        // What will happen if a user enters a negative number for a year of birth?
        // Need to validate
        // What will happen if we enter a name for a year of birth or some letters?
        // An input mismatch exception. Crashes program.
        // solved by using hasNextInt - returns a boolean.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();  // checks if there's an int in the scanner, doesn't remove it from the scanner so we can still get and store the value in the scanner.nextInt() line below.

        if(hasNextInt) {

            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); // Handle next line character (enter key)

            System.out.println("Enter your name: ");

            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;

            if (age >= 0 && age <= 100) {

                System.out.println("Your name is " + name + ", and you are " + age + " years old.");

            } else {

                System.out.println("Invalid year of birth");

            }

        } else {

            System.out.println("Unable to parse year of birth.");

        }

        scanner.close();

    }

}
