package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] a1 = new int[] {-3, 2, 4, 3, 5, 12, 8};
        int[] a2 = new int[] {-3, 2, 4, 13, 5, 12, 8};
        int[] a3 = new int[] {18, 1, 3, 6, 7, -5};
        int[] a4 = new int[] {-18, 21, 3, 6, 7, 65};

        int[] b1 = new int[] {-3, 2, 3, 5, 8};
        int[] b2 = new int[] {-3, 2, 4, 5, 8};
        int[] b3 = new int[] {1, 3, 6, -5};
        int[] b4 = new int[] {-18, 3, 6, 7};

        System.out.println("Array: " + Arrays.toString(a1));
        System.out.println("Expected: \t" + Arrays.toString(b1));
        System.out.println("Actual: \t" + Arrays.toString(removeLocalMaxima(a1)));
        System.out.println("");

        System.out.println("Array: " + Arrays.toString(a2));
        System.out.println("Expected: \t" + Arrays.toString(b2));
        System.out.println("Actual: \t" + Arrays.toString(removeLocalMaxima(a2)));
        System.out.println("");

        System.out.println("Array: " + Arrays.toString(a3));
        System.out.println("Expected: \t" + Arrays.toString(b3));
        System.out.println("Actual: \t" + Arrays.toString(removeLocalMaxima(a3)));
        System.out.println("");

        System.out.println("Array: " + Arrays.toString(a4));
        System.out.println("Expected: \t" + Arrays.toString(b4));
        System.out.println("Actual: \t" + Arrays.toString(removeLocalMaxima(a4)));
        System.out.println("");

        {
            int[] array = new int[1000];
            Arrays.fill(array, 15);
            array[0] = 20;
            array[999] = 25;
            array[168] = 30;
            int[] actual = removeLocalMaxima(array);

            System.out.println("length has to be 997: " + actual.length);
            System.out.println("Array[0]: " + actual[0]);
            System.out.println("Array[996]: " + actual[996]);

            System.out.println("");
        }

        {
            int[] array = new int[15000];
            Arrays.fill(array, 10);

            int[] actual = removeLocalMaxima(array);
            System.out.println("Array == Actual ? :\t" + (array.length == actual.length));
        }



    }
    public static int[] removeLocalMaxima(int[] array) {
        List<Integer> temp = new ArrayList<Integer>();

        if(array[0] <= array[1]) {
            temp.add(array[0]);
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                continue;
            }
            temp.add(array[i]);
        }

        if(array[array.length - 1] <= array[array.length - 2]) {
            temp.add(array[array.length - 1]);
        }

        return temp.stream()
                .mapToInt(el -> el)
                .toArray();
    }
}
