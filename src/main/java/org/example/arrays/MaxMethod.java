package org.example.arrays;
public class MaxMethod {
    public static void main(String[] args) {
        int[] values = new int[]{806, 19, 140, 392, 36, 528, 542, 890, 424};
        System.out.println(MaxMethod.max(values));
    }
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int i : array) {
            if (i > max) max = i;
        }
        return max;
    }
}
