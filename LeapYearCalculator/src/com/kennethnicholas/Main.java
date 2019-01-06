//        ---
//        ** Please read this entire page before attempting to solve this coding exercise.
//        Additional help is available by watching the video mentioned at the bottom of the page **
//        ---
//
//        Write a method isLeapYear with a parameter of type int named year.
//
//        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//
//        If the parameter is not in that range return false.
//
//        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//        otherwise return false.
//
//        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
//
//        Examples of input/output:
//
//        isLeapYear(-1600); should return false since parameter is not in the range (1-9999)
//        isLeapYear(1600); should return true since 1600 is leap year
//        isLeapYear(2017); should return false since 2017 is not a leap year
//        isLeapYear(2000); should return true because 2000 is a leap year
//
//        NOTE: The isLeapYear method needs to be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.
//
//        --
//
//        NEED HELP?  If you have not already watched video "Introduction To Coding Exercises",
//        make sure you do that before you attempt this or any other challenge.
//        I show you how to go about solving a challenge, but also COMMON ERRORS you may get when attempting it.
//

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear (int year) {

        boolean isLeap;

        if ((year >= 1) && (year <= 9999))
        {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                isLeap = true;
            }
            else if (year % 400 == 0) {
                isLeap = true;
            }
            else {
                isLeap = false;
            }
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }
}
