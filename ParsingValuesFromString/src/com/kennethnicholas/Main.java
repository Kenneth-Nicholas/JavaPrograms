package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018.125";

        System.out.println("numberAsString = " + numberAsString);

        // int number = Integer.parseInt(numberAsString);

        double number = Double.parseDouble(numberAsString);

        System.out.println("number = " + number);

        numberAsString += 1; // causes numberAsString to = 20181 // causes numberAsString to = 2018.1251

        number += 1; // causes number to = 2019 // causes numberAsString to = 2019.125

        System.out.println("numberAsString = " + numberAsString);

        System.out.println("number = " + number);
        
    }
}
