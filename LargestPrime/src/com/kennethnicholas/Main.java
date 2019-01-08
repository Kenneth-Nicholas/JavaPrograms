// Largest Prime
// Write a method named getLargestPrime with one parameter of type int named number.
// If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
// The method should calculate the largest prime factor of a given number and return it.
// Example Input / Output:
// getLargestPrime(21); should return 7 since 7 is the largest prime (3 * 7 = 21)
// getLargestPrime(217); should return 31 since 31 is the largest prime (7 * 31 = 217)
// getLargestPrime(0); should return -1 since 0 does not have any prime numbers
// getLargestPrime(45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
// getLargestPrime(-1); should return -1 since the parameter is negative
// Hint: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
// Note: The getLargestPrime method should be defined as public static like we have been doing so far in the course.
// Note: Do not add a main method to the solution code.

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {

        if(number < 2) {    // if number is less than 2 it cannot be prime

            return -1;

        }

        int count = 2;

        while(number > 1) {             // number is eventually divided by count, a factor, which increments and becomes greatest common factor that is prime

            if(number % count == 0) {   // if number can be evenly divided by the count, you might as well do that because the count is a prime factor

                number /= count;        // so do that

            } else {

                count++;                // increment count if it can't go into number evenly to try again.

            }

        }

        return count;

    }

}

/*
45 > 1
count = 2
45 % 2 = 1
count = 3
45 % 3 = 0
number becomes 15
15 > 1
count = 3 still
15 % 3 = 0
number becomes 5
 */