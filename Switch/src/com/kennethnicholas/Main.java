package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 6;

        switch(switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;

        }

        // More code here, executes after the break occurs. Without a break it executes all the code.
        // switch can be used with byte, short, char, and int

        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display a message if any of these are found and then a break
        // Add a default which displays a message saying not found

        char switchChar = 'A';

        switch(switchChar) {

            case 'A':
                System.out.println("Character was an A");
                break;

            case 'B':
                System.out.println("Character was a B");
                break;

            case 'C':
                System.out.println("Character was a C");
                break;

            case 'D':
                System.out.println("Character was a D");
                break;

            case 'E':
                System.out.println("Character was an E");
                break;

            default:
                System.out.println("Not found");
                break;

        }

        String month = "JuNE";

        switch(month.toUpperCase()) {
            case "JANUARY": case "FEBRUARY": case "MARCH": case "APRIL": case "MAY": case "JUNE":
            case "JULY": case "AUGUST": case "SEPTEMBER": case "OCTOBER": case "NOVEMBER": case "DECEMBER":
                System.out.println("Month was " + month.toUpperCase());
                break;

            default:
                System.out.println("Not sure");
                break;
        }

    }
}
