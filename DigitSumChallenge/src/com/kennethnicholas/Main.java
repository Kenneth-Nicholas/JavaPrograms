// Digit Sum Challenge
// Write a method with the name sumDigits that has one int parameter called number.
// If parameter is >= 10 then the method should process the number and return sum of all digits,
// otherwise return -1 to indicate an invalid value.
// The numbers from 0-9 have 1 digit so we don't want to process them, also we don't
// want to process negative numbers, so also return -1 for negative numbers.
// For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
// Calling the method sumDigits(1) should return -1 as per requirements described above.
// Add some code to the main method to test out the sumDigits method to determine
// that it is working correctly for valid and invalid values passed as arguments.
// Hint:
// Use n % 10 to extract the least-significant digit.
// use n = n / 10 to discard the least significant digit.
// The method needs to be static like other methods so far in the course.
// Tip:
// Create a project with the name DigitSumChallenge.

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 = " + sumDigits(123));
        System.out.println("The sum of the digits in number 1234 = " + sumDigits(1234));
        System.out.println("The sum of the digits in number 12345 = " + sumDigits(12345));
        System.out.println("The sum of the digits in number 123456 = " + sumDigits(123456));
        System.out.println("The sum of the digits in number 1234567 = " + sumDigits(1234567));
        System.out.println("The sum of the digits in number 12345678 = " + sumDigits(12345678));
        System.out.println("The sum of the digits in number 123456789 = " + sumDigits(123456789));
        System.out.println("The sum of the digits in number 1234567890 = " + sumDigits(1234567890));
    }

    public static int sumDigits(int number) {

        int sum = 0;

        if(number < 10) {

            sum = -1;

        } else {

            while(number > 0) {
                // extract the least-significant digit
                int digit = number % 10;
                sum += digit;
                // drop the least-significant digit
                number /= 10;
            }

        }

        return sum;

    }

}
