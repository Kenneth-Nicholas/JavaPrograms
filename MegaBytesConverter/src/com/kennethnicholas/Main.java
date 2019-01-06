//        MegaBytes Converter
//
//        ---
//        ** Please read this entire page before attempting to solve this coding exercise.
//        Additional help is available by watching the video mentioned at the bottom of the page **
//        ---
//
//        Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
//
//        The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
//
//        Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
//        XX represents the original value kiloBytes. YY represents the calculated megabytes.
//        ZZ represents the calculated remaining kilobytes.
//
//        If the parameter kiloBytes is < 0 then print instead the text "Invalid Value".
//
//        Example: printMegaBytesAndKiloBytes(2050) should print "2050 KB = 2 MB and 2 KB"
//        TIP: Be careful about spaces in the printed message.
//        TIP: Use the remainder operator
//        TIP: 1 MB = 1024 KB
//
//        NOTE: The printMegaBytesAndKiloBytes method needs to be defined as public static like we have been doing so far in the course.
//
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
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int calculatedMegabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes - (calculatedMegabytes * 1024);
            System.out.println(kiloBytes + " KB = " + calculatedMegabytes + " MB and " + remainingKilobytes + " KB");
        }

    }
}
