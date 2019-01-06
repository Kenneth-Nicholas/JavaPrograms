package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        int int2 = 5;
        // False, true, null - reserved keywords, just like int, short, byte, long, float, double, boolean, String, etc.

        // Expressions
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if(highScore == 50) {
            System.out.println("This is an expression");
        }

        // In the following code that I will type below, write down what parts of the code
        // are expressions.
        int score = 90; // This line is an expression score = 100
        if (score > 99) { // Inside these parentheses is an expression score > 99
            System.out.println("You got the high score!"); // Inside these parentheses is an expression "You got the high score!"
            score = 0; // This is also an expression score = 0
        }

    }
}
