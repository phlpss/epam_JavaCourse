package org.example.arrays;

public class Spiral {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        int[][] result = spiral(rows, columns);
        printMatrix(result);
    }

    public static int[][] spiral(int rows, int columns) {
        int[][] spiralArray = new int[rows][columns];

        int value = 1;
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = columns - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            for (int col = leftCol; col <= rightCol; col++) {
                spiralArray[topRow][col] = value++;
            }
            topRow++;

            for (int row = topRow; row <= bottomRow; row++) {
                spiralArray[row][rightCol] = value++;
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    spiralArray[bottomRow][col] = value++;
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    spiralArray[row][leftCol] = value++;
                }
                leftCol++;
            }
        }

        return spiralArray;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
}
