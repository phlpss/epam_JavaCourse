package org.example.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] vals = new int[]{1, 3, 2, 8, 198, 15};
        System.out.println(sum(new int[0]));
    }

    // return the sum of even numbers in array
    public static int sum(int[] array) {
        if(array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i : array) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
