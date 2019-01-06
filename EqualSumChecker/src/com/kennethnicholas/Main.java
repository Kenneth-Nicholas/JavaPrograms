//
// Equal Sum Checker
// Write a method hasEqualSum with 3 parameters of type int.
//
// The method should return boolean and it needs to return true if sum of first and second parameter is equal to third parameter.
// Otherwise return false.
//
// Examples of input/output:
//
// hasEqualSum(1, 1, 1); should return false since 1 + 1 is not equal to 1
// hasEqualSum(1, 1, 2); should return true since 1 + 1 is equal to 2
// hasEqualSum(1, -1, 0); should return true since 1 + (-1) is 1 - 1 and is equal to 0
//
// Note: The hasEqualSum method needs to be defined as public static like we have been doing so far in the course.
// Note: Do not add a main method to the solution code.
//

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int sum) {

        boolean testCondition;

        if (sum == (numberOne + numberTwo)) {
            testCondition = true;
        }
        else {
            testCondition = false;
        }

        return testCondition;

    }
}
