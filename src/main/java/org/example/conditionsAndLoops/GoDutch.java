package org.example.conditionsAndLoops;
// Consider a company of friends visiting a restaurant. They decided to equally split the bill.
// Friends decided to add 10 percent of the bill total amount as tips.
// Then they cover the total payment in equal parts.
// Please, proceed to GoDutch class and write a program that
// reads a bill total amount and a number of friends, and then prints part to pay.

// Consider some details:
//  Program must read data from System.in.

//  Bill total amount cannot be negative. If input value is negative,
//  the program stops, printing: Bill total amount cannot be negative.

//  Number of friends cannot be negative or zero. If input value is,
//  then the program stops, printing: Number of friends cannot be negative or zero.
//  Bill total amount, number of friends and part to pay are integers.

import java.util.Scanner;
public class GoDutch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        int numberOfFriens = in.nextInt();

        if(amount < 0) {
            System.out.println("Bill total amount cannot be negative");
            System.exit(1);
        }
        if(numberOfFriens <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            System.exit(1);
        }

        int tips = amount / 10;
        int totalAmount = amount + tips;
        int part = totalAmount / numberOfFriens;

        System.out.println(part);

    }
}
