//
//        Flour Pack Problem
//
//        Write a method named canPack with three parameters of type int named bigCount, smallCount and goal.
//
//        The parameter bigCount represents the count of big flour bags (5 kilo each).
//
//        The parameter smallCount represents the count of small flour bags (1 kilo each).
//
//        The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
//
//        Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
//        The method should return true if it is possible to make a package with goal kilos of flour.
//
//        If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
//        For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false because each
//        bigCountbag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5,
//        the method should return true because 1 full bigCount bag and 4 full smallCount bags equal goal,
//        and it's okay if there are additional bags left over.
//
//        If any of the parameters are negative, return false.
//
//        EXAMPLE INPUT/OUTPUT:
//
//        canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
//        canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//        canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos.
//        canPack (2, 2, 12); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2
//        (small bags of 1 kilo), makes in total 12 kilos and goal is 12 kilos.
//        canPack (-3, 2, 12); should return false since bigCount is negative.
//
//        NOTE: The canPack method should be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.
//

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        boolean testCondition;

        int smallBag = 1;
        int bigBag = 5;

        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {      // if any parameter is a negative number return false

            testCondition = false;

        } else if (((bigCount * bigBag) + (smallCount * smallBag)) >= goal) {       // if adding up the values of our big bags and small bags is greater than or equal to our goal, we're good for now that is.

            if((bigCount * bigBag < goal)) {                                        // if the big bag total value is less than our goal, we know we will need small bags too

                if(goal - (bigCount * bigBag) - (smallCount * smallBag) <= 0) {     // if the goal minus total value of big bags & total value of small bags is less than or equal to zero, we've reached or surpassed goal

                    testCondition = true;                                           // since the big bags total value was less than our goal we don't need to worry about going over our exact goal. Rest of the goal is met with small bags so return true.

                } else {                                                            // otherwise, not enough small bags, so return false.

                    testCondition = false;

                }

            } else if (goal % 5 <= smallCount) {                                    // if the remainder of the goal after using all the big bags we have is less than or equal to our small count, we're good.

                testCondition = true;                                               // therefore return true

            } else {                                                                // otherwise, not enough small bags

                testCondition = false;                                              // therefore return false

            }

        } else {                                                                    // otherwise not enough total to meet goal

            testCondition = false;                                                  // therefore return false

        }

        return testCondition;

    }

}