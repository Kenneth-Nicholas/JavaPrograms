package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        // width of 32 bits (4 bytes)
        int myIntValue = 5 / 2;
        // width of 32 bits (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of 64 bits (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Create the number of kilograms for the number above and store in a variable.
        // 3. Print out the result
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numberOfPounds = 200d;
        double numberOfKilograms;
        double kilogramsInAPound = 0.45359237d;

        numberOfKilograms = numberOfPounds * kilogramsInAPound;

        System.out.println(numberOfPounds + " pounds is equal to " + numberOfKilograms + " kilograms.");
    }
}
