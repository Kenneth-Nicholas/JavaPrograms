//        Number To Words
//
//        Write a method called numberToWords with one int parameter named number.
//
//        The method needs to print out the passed number using words for the digits.
//
//        If the number is negative then print "Invalid Value".
//
//        To print the number in words use the following steps
//
//        1. Extract last digit of given number using the remainder operator.
//        2. Switch the value of digit found above. There are 10 possible values of digits those being 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9.
//           Print the corresponding word for each digit.  e.g.  print "Zero" if digit is 0, "One" if digit is 1, and so on.
//        3. Remove the last digit from the number.
//        4. Repeat step 2 through 4 until the number is 0.
//
//        The logic above is correct but the words will be printed in reverse order. For example if the number is 234 the logic above will produce the
//        output "Four Three Two" instead of "Two Three Four". To overcome this problem write a second method called reverse.
//
//        The reverse method has one int parameter and returns the reversed number (int). For example if the number passed is 234 then the
//        reversed number returned would be 432.
//
//        The reverse method should also reverse negative numbers. Use the reverse method in the numberToWords method then print the
//        words in the correct order.
//
//        For the number 100 the reverse number is 001. The logic above for the method numberToWords will print "One" but that is incorrect it
//        should print "One Zero Zero".
//
//        To solve the problem with leading zeroes write a third method getDigitCount.
//
//        The getDigitCount method has one int parameter number and returns the count of digits in that number. If the number is negative then
//        return -1 to indicate an invalid value.
//
//        If number has the value of 100 then the method getDigitCount needs to return 3 since the number 100 has 3 digits 1, 0, 0.
//
//        Example Input/Output - getDigitCount method
//
//        getDigitCount(0); should return 1 since there is only 1 digit.
//        getDigitCount(123); should return 3.
//        getDigitCount(-12); should return -1 since the parameter is negative.
//        getDigitCount(5200); should return 4 since there are 4 digits in the number.
//
//        Example Input/Output - reverse method
//
//        reverse(-121); should  return -121.
//        reverse(1212); should return  2121.
//        reverse(1234); should return 4321.
//        reverse(100); should return 1.
//
//        Example Input/Output - numberToWords method
//
//        numberToWords(123); should print "One Two Three".
//        numberToWords(1010); should print "One Zero One Zero".
//        numberToWords(1000); should print "One Zero Zero Zero".
//        numberToWords(-12); should print "Invalid Value" since the parameter is negative.
//
//        HINT: Use a for loop to print zeroes after reversing the number.
//
//        e.g. 100 reversed is 1 so needs to print "One Zero Zero".
//        To get the number of zeroes check the difference between the digit count from the original number and the
//        reversed number.
//
//        NOTE: Methods numberToWords, getDigitCount, reverse need to be defined as public static like we have been doing so far in the course.
//        NOTE: In total you have to write 3 methods.
//        NOTE: When printing words for example numberToWords(123); each word can be in its own line, for example
//
//        One
//        Two
//        Three
//
//        They don't have to be separated by a space.

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        numberToWords(234);
        numberToWords(100);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords(int number) {

        int numberOfDigits = getDigitCount(number);

        number = reverse(number);

        int numberOfDigitsReversed = 0;

        int lastDigit = 0;

        if (number < 0) {

            System.out.println("Invalid Value");

        } else {

            while (number != 0) {

                lastDigit = number % 10;

                switch (lastDigit) {

                    case 0:
                        System.out.print("Zero ");
                        numberOfDigitsReversed++;
                        break;
                    case 1:
                        System.out.print("One ");
                        numberOfDigitsReversed++;
                        break;
                    case 2:
                        System.out.print("Two ");
                        numberOfDigitsReversed++;
                        break;
                    case 3:
                        System.out.print("Three ");
                        numberOfDigitsReversed++;
                        break;
                    case 4:
                        System.out.print("Four ");
                        numberOfDigitsReversed++;
                        break;
                    case 5:
                        System.out.print("Five ");
                        numberOfDigitsReversed++;
                        break;
                    case 6:
                        System.out.print("Six ");
                        numberOfDigitsReversed++;
                        break;
                    case 7:
                        System.out.print("Seven ");
                        numberOfDigitsReversed++;
                        break;
                    case 8:
                        System.out.print("Eight ");
                        numberOfDigitsReversed++;
                        break;
                    case 9:
                        System.out.print("Nine ");
                        numberOfDigitsReversed++;
                        break;

                }

                number /= 10;

            }

            while (numberOfDigitsReversed < numberOfDigits) {

                System.out.print("Zero ");
                numberOfDigitsReversed++;

            }

        }

    }

    public static int reverse(int number) {

        int reverse = 0;

        int lastDigit = 0;

        while (number != 0) {

            lastDigit = number % 10;
            number /= 10;
            reverse += lastDigit;

            if (number != 0) {

                reverse *= 10;

            }

        }

        return reverse;

    }

    public static int getDigitCount(int number) {

        int digitCount = 0;

        if (number == 0) {

            digitCount++;

        } else if (number < 0) {

            digitCount = -1;

        } else {

            while (number != 0) {

                digitCount++;
                number /= 10;

            }

        }

        return digitCount;

    }

}
