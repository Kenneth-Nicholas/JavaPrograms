//
//        Number In Word
//
//        ---
//        ** Please read this entire page before attempting to solve this coding exercise.
//        Additional help is available by watching the video mentioned at the bottom of the page **
//        ---
//
//        Write a method called printNumberInWord.
//
//        This method should have one parameter called number which a whole number (type int).
//
//        The method needs to print "ZERO" if the number parameter is passed with the value of 0.
//        The method needs to print "ONE" if the number parameter is passed with the value of 1.
//        The method needs to print "TWO" if the number parameter is passed with the value of 2.
//
//        ... and so on up to and including "NINE" if the number parameter is passed with the value of 9.
//
//        If the number parameter has any other value than 0 to 9, then the method should print "OTHER".
//
//        You can use an if-else statement or a the switch statement to solve this challenge - the choice is yours.
//
//        NOTE: The printNumberInWord method needs to be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a  main method to solution code.
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

        printNumberInWord(-1);
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);

    }

    public static void printNumberInWord(int number) {
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }
}
