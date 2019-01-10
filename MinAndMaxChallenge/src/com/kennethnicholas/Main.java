// Minimum And Maximum Challenge
// Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
// Before the user enters the number, print the message "Enter number:"
// If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
// Hint:
// Use an endless while loop.
// Bonus:
// Create a project with the name MinAndMaxInputChallenge.

package com.kennethnicholas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberHolder;

        int minimum = Integer.MAX_VALUE;

        // int minimum = 0; before change

        int maximum = Integer.MIN_VALUE;

        // int maximum = 0; before change

        boolean first = true;

        while(true) {

            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                numberHolder = scanner.nextInt();

                if(first) {   // prevents you from getting a minimum or max of 0 (from initializing to 0) if you only enter one number.

                    first = false;

                    minimum = numberHolder;

                    maximum = numberHolder;

                } else if(numberHolder > maximum) {

                    maximum = numberHolder;

                } else if (numberHolder < minimum) {

                    minimum = numberHolder;

                }

            } else {

                break;

            }

            scanner.nextLine();

        }

        System.out.println("minimum = " + minimum + " maximum = " + maximum);

        scanner.close();

    }

}

// another solution to the minimum or maximum value of 0.
// setting minimum and maximum = to minimum and maximum value an int can be when initializing the variables.
// set minimum to = 2_147_483_647
// set maximum to = -2_147_483_648
// if you do this, then if you only enter one number before entering something to break out of the loop,
// both your min and max will equal whatever you entered.
// setting minimum to the max int value, and maximum to the min int value, you ensure that they will be replaced.
