package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        // Byte has a width of 8 bits
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        // Short has a width of 16 bits
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;

        // Integer has a width of 32 bits
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;

        // Long has a width of 64 bits
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        int myNewIntValue = (myMinIntValue/2);
        System.out.println("myNewIntValue = " + myNewIntValue);

        long myNewLongValue = (myMinLongValue / 2);
        System.out.println("myNewLongValue = " + myNewLongValue);

        // Challenge
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create an int variable and set it to any valid int number.
        // 4. Create a variable of type long, and make it equal to 50000 + 10 times the sum of the byte, plus the short, plus the int

        byte challengeByteValue = 10;
        short challengeShortValue = 20;
        int challengeIntValue = 50;
        long challengeLongValue = (50_000L) + 10L * (challengeByteValue + challengeShortValue + challengeIntValue);
        System.out.println("challengeLongTotal = " + challengeLongValue);

    }
}
