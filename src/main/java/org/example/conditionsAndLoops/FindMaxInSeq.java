package org.example.conditionsAndLoops;
import java.util.Scanner;

// Proceed to FindMaxInSeq and write a program that reads a sequence of integers
// from standard output and finds the maximum value.
// You must place your solution into the max method to pass tests.
//
//Details:
// You must read sequence values until the next one is 0.
// The sequence is guaranteed to contain at least one value.
public class FindMaxInSeq {
    public static void main(String[] args) {
        System.out.println(max());
    }

    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
