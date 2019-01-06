package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        double interestRate = 2.0;
        double amount = 10000.00;

        for(int i = 2; i < 9; i++) {
            System.out.println("Investing " + amount + " at an interest rate of " + interestRate
                    + " returned a profit of " + String.format("%.2f", calculateInterest(amount, interestRate)));
            interestRate++;
        }

        interestRate = 8.0;
        amount = 10000.00;

        for(int j = 8; j > 1; j--) {
            System.out.println("Investing " + amount + " at an interest rate of " + interestRate
                    + " returned a profit of " + String.format("%.2f", calculateInterest(amount, interestRate)));
            interestRate--;
        }

        int primeCount = 0;

        for(int k = 2; k <= 7919; k++) {    // first 1000 prime numbers; 2 through 7919
            if(isPrime(k)) {
                System.out.print(k + " is a prime number");
                primeCount++;
                System.out.println(", the number " + primeCount + " prime found");
            }
        }

        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {  // checks if int n is a prime number or not

        if(n == 1) {                        // if int n is the number 1 it cannot be prime by definition
            return false;                   // hence return false
        }

        for (int l = 2; l <= n/2; l++) {    // set i = to 2 because we know 1 goes into every prime,
            if (n % l == 0) {               // then increment i because you only want to test if numbers go into n up to half the value of n.
                return false;               // i.e., after checking if 50 goes into 100, you don't need to keep checking beyond 50
            }                               // if a number is even it's not prime except 2
        }                                   // keep incrementing i and see if larger and larger numbers divide evenly into n
        // if they do, return false, because it's not prime
        return true;                        // otherwise, return 2
        // anytime loop is exited, we know it's prime
    }
    // it would be more optimal to use l <= (long) Math.sqrt(n);
    // as the test condition when checking for primes
    // instead of l <= n/2;

    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate / 100));

    }



}
