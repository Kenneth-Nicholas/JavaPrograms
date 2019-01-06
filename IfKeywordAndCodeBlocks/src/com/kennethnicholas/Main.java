package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) { // can omit the brackets if you only have one line of code that gets executed upon satisfaction of the condition.
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000 ){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1_000;
            System.out.println("Your final score was " + finalScore);
        }

//        int savedFinalScore = finalScore; Java automatically deletes variables created inside a code block after the code block has finished executing
//                                          as a result, you cannot use finalScore here because it is outside of the variable's scope.

        // Print out a second score on the screen with the following
        // Score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        int secondScore = score + (levelCompleted * bonus);
        System.out.println("Your second score was " + secondScore);

    }
}
