//
//        Last Digit Checker
//
//        Write a method named hasSameLastDigit with three parameters of type int.
//
//        Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//        The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
//
//        EXAMPLE INPUT/OUTPUT:
//
//        hasSameLastDigit (41, 22, 71); should return true since 1 is the rightmost digit in numbers 41 and 71
//        hasSameLastDigit (23, 32, 42); should return true since 2 is the rightmost digit in numbers 32 and 42
//        hasSameLastDigit (9, 99, 999); should return false since 9 is not within the range of 10-1000
//
//        NOTE: The hasSameLastDigit method needs to be defined as public static as we have been doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {



    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {

        boolean testCondition;

        int numberOneLastDigit = 0;
        int numberTwoLastDigit = 0;
        int numberThreeLastDigit = 0;

        if((numberOne < 10) || (numberOne > 1000)) {

            testCondition = false;

        } else if((numberTwo < 10) || (numberTwo > 1000)) {

            testCondition = false;

        } else if((numberThree < 10) || (numberThree > 1000)) {

            testCondition = false;

        } else {

            numberOneLastDigit = numberOne % 10;
            numberTwoLastDigit = numberTwo % 10;
            numberThreeLastDigit = numberThree % 10;

            if(numberOneLastDigit == numberTwoLastDigit || numberTwoLastDigit == numberThreeLastDigit || numberOneLastDigit == numberThreeLastDigit) {

                testCondition = true;

            } else {

                testCondition = false;

            }

        }

        return testCondition;

    }

}
