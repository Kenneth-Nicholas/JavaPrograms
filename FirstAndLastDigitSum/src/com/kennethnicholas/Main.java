//
//        First And Last Digit Sum
//
//        ---
//        ** Please read this entire page before attempting to solve this coding exercise.
//        Additional help is available by watching the video mentioned at the bottom of the page **
//        ---
//
//        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//        The method needs to find the first and last digit of the parameter number passed to the method,
//        using a loop and return the sum of the first and last digit of that number.
//
//        If the number is negative then the method needs to return -1 to indicate an invalid value.
//
//        Example input/output
//
//        sumFirstAndLastDigit(252); should return 4,
//        first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
//
//        sumFirstAndLastDigit(257); should return 9,
//        first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
//
//        sumFirstAndLastDigit(0); should return 0, first digit and the last digit is 0,
//        since we only have 1 digit, which gives us 0+0 and the sum is 0.
//
//        sumFirstAndLastDigit(5); should return 10, first digit and last digit is 5,
//        since we only have 1 digit, which gives us 5+5 and the sum is 10.
//
//        sumFirstAndLastDigit(-10); should return -1, because the parameter is negative and needs to be positive.
//
//        NOTE: The sumFirstAndLastDigit method needs to be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a  main method to solution code
//
//        --
//
//        NEED HELP?  If you have not already watched video "Introduction To Coding Exercises",
//        make sure you do that before you attempt this or any other challenge.
//        I show you how to go about solving a challenge, but also COMMON ERRORS you may get when attempting it.
//
//        Remember:  You need to solve this coding exercise EXACTLY as stated.  Using a different method name,
//        or returning a different data type, even adding an extra space to  information being printed out,
//        or returned from a method will likely cause your solution to fail!

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {

            return -1;

        }

        int lastDigit = number % 10;

        while(number >= 10) {

            number /= 10;

        }

        int firstDigit = number;

        return firstDigit + lastDigit;

    }

}
