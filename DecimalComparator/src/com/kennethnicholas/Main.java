//
//        DecimalComparator
//
//        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//        The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
//        Otherwise return false.
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        areEqualByThreeDecimalPlaces(-3.1756, -3.175); should return true since numbers are equal up to 3 decimal places.
//        areEqualByThreeDecimalPlaces(3.175, 3.176); should return false since numbers are not equal up to 3 decimal places
//        areEqualByThreeDecimalPlaces(3.0, 3.0); should return true since numbers are equal up to 3 decimal places.
//
//        NOTE: The areEqualByThreeDecimalPlaces method needs to be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        boolean testCondition;

        int a = (int)(numberOne * 1_000);
        int b = (int)(numberTwo * 1_000);

        if (a == b) {
            testCondition = true;
        } else {
            testCondition = false;
        }

        return testCondition;

    }
}
