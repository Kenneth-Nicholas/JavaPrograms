package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        while (count != 6) {

            System.out.println("Count value is " + count);
            count++;

        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {

            number++;

            if (!isEvenNumber(number)) {

                continue;   // Different from break, continue bypasses the print statement when a number is odd, and goes back to the start of the loop

            } else {

                evenNumbersFound++;
                System.out.println("Even number " + number);

                if (evenNumbersFound == 5) {

                    System.out.println("There were " + evenNumbersFound + " even numbers found.");
                    break;

                }

            }
        }

    }

// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false.
//
// Modify the while code above
// Make it also record the total number of even numbers it has found
// And break once five are found
// And at the end, display the total number of even numbers found

    public static boolean isEvenNumber(int number) {

        boolean testCondition;

        if ((number == 0) || (number % 2 == 0)) {

            testCondition = true;

        } else {

            testCondition = false;

        }

        return testCondition;

    }

}
