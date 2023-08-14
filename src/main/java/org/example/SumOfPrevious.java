package org.example;

import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
    int[] vals = new int[]{1, -1, 10, 4, 6, 13, 15, 25};
    System.out.println(Arrays.toString(getSumCheckArray(vals)));
}
    // receive an array of int values and return an array of booleans where each element is a result of
    // a check if a corresponding element is a sum of two previous elements in given array.

    // The length of given array is guaranteed to be 2 or more.
    // Given array is guaranteed to be not null.
    // Method returns an array of booleans where each element is a result for corresponding element in given array.
    // First two elements of the boolean array are always false.
    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        result[0] = false;
        result[1] = false;

        for(int i = 2; i < array.length; i++) {
            if(array[i] == array[i - 1] + array[i - 2]) {
                result[i] = true;
            } else
                result[i] = false;
        }
        return result;
    }
}
