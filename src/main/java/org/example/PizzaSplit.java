package org.example;

import java.util.Scanner;

// The program must read two values from System.in:
//      Number of people
//      Number of pieces per pizza
// It is guaranteed that this values are positive integers.

// Then the program must print the minimum number of pizzas (not zero)
// so that everyone has an equal number of slices and no slice is left.
public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfSlices = scanner.nextInt();

        int numberOfPizzas = 1;
        int temp = numberOfSlices;

        while (temp % numberOfPeople != 0) {    // 8 % 12 != 0      // 16 % 12 != 0     // 24 % 12 == 0
            numberOfPizzas++;   // 2    // 3
            temp = numberOfSlices * numberOfPizzas; // 8 * 2 == 16  // 8 * 3 == 24
        }
        System.out.println(numberOfPizzas);
    }
}
