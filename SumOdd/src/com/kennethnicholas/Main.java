//
//        Sum Odd
//
//        ---
//        ** Please read this entire page before attempting to solve this coding exercise.
//        Additional help is available by watching the video mentioned at the bottom of the page **
//        ---
//
//        Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
//
//        Check that number is > 0, if it is not return false.
//
//        If number is odd return true, otherwise  return false.
//
//        Write a second method called sumOdd that has 2 int parameters start and end,
//        which represent a range of numbers.
//
//        The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
//
//        It should call the method isOdd to check if each number is odd.
//
//        The parameter end needs to be greater than or equal to start,
//        and both start and end parameters have to be greater than 0.
//
//        If those conditions are not satisfied return -1 from the method to indicate invalid input.
//
//        Example input/output:
//
//        System.out.println(sumOdd(1, 100)); // should print  2500
//
//        System.out.println(sumOdd(-1, 100)); // should print  -1
//
//        System.out.println(sumOdd(100, 100)); // should print  0
//
//        System.out.println(sumOdd(100, -100)); // should print  -1
//
//        System.out.println(sumOdd(100, 1000)); // should print  247500
//
//        TIP: use the remainder operator to check if the number is odd
//
//        NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.
//
//        --
//
//        NEED HELP?  If you have not already watched video "Introduction To Coding Exercises",
//        make sure you do that before you attempt this or any other challenge.
//        I show you how to go about solving a challenge, but also COMMON ERRORS you may get when attempting it.
//
//        Remember:  You need to solve this coding exercise EXACTLY as stated.
//        Using a different method name, or returning a different data type,
//        even adding an extra space to  information being printed out,
//        or returned from a method will likely cause your solution to fail!

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        boolean testCondition;

        if (number < 0) {
            testCondition = false;
        } else if((number % 2 == 1) || (number == 1)) {
            testCondition = true;
        } else {
            testCondition = false;
        }

        return testCondition;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if((end >= start) && (start > 0) && (end > 0)) {
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            sum = -1;
        }
        return sum;
    }

}
