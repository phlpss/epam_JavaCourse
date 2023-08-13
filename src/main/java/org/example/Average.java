package org.example;
import java.util.Scanner;

// You must read sequence values until the next one is 0.
// Zero value means end of the input sequence.
// The sequence is guaranteed to contain at least one value.
// Average value is also an integer. Use integer operations.

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            counter++;
        }
        int average = (sum / counter);
        System.out.println(average);
    }
}
