package org.example.conditionsAndLoops;

import java.util.Scanner;

// Consider a snail travels up a tree a feet each day.
// Then snail slides down b feet each night.
// Height of the tree is h feet.
// Write a program that prints number of days for the snail to reach the top of the tree.
// Program reads a, b, h line by line. Input values are guaranteed to be positive integers.
// If the snail cannot reach the top of the tree, print the message Impossible.

public class Snail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // distance climbed during the day
        int b = in.nextInt(); // distance slid down during the night
        int h = in.nextInt(); // height of the tree

        if (a >= h) {
            System.out.println("1");
        } else if (a <= b && a <= h) {
            System.out.println("Impossible");
        } else {
            int days = (h - b - 1) / (a - b) + 1;

            System.out.println(days);
        }
        in.close();
    }
}

