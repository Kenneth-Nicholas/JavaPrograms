// EvenDigitSum
// Write a method named getEvenDigitSum with one parameter of type int called number.
// The method should return the sum of the even digits within the number.
// If the number is negative, the method should return -1 to indicate an invalid value.
// Example Input / Output:
// getEvenDigitSum(123456789); should return 20 since 2 + 4 + 6 + 8 = 20
// getEvenDigitSum(252); should return 4 since 2 + 2 = 4
// getEvenDigitSum(-22); should return -1 since the number is negative
// Note: The getEvenDigitSum method should be defined as public static like we have been doing so far in the course.
// Note: Do not add a main method to the solution code.


package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {

        int lastDigit;
        int sumEvenDigits = 0;

        while(number > 0) {

            lastDigit = number % 10;

            if(lastDigit % 2 == 0) {
                sumEvenDigits += lastDigit;
            }

            number /= 10;

        }

        if(number < 0){
            sumEvenDigits = -1;
        }

        return sumEvenDigits;

    }

}
