package org.example.arrays;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        int i, j, k;

        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix2[0].length; j++) { // Corrected loop condition
                result[i][j] = 0;
                for (k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        {
            int[][] a = { {1, 2}, {7, -13} };
            int[][] b = { {1, 2}, {7, -13} };
            int[][] expected = {{15, -24}, {-84, 183}};
            int[][] actual = MultiplyMatrix.multiply(a, b);
            System.out.println("1: \t" + (Arrays.deepToString(expected).equals(Arrays.deepToString(actual))));
        }
        {
            int[][] a = { {0, 0}, {0, 0} };
            int[][] b = { {0, 0}, {0, 0} };
            int[][] expected = {{0, 0}, {0, 0}};
            int[][] actual = MultiplyMatrix.multiply(a, b);
            System.out.println("2: \t" + (Arrays.deepToString(expected).equals(Arrays.deepToString(actual))));
        }
        {
            int[][] a = { {0, 12345}, {4509, 0}, {3, 567} };
            int[][] b = { {653, 0, 25353}, {0, 61, 6} };
            int[][] expected = {{0, 753045, 74070}, {2944377, 0, 114316677}, {1959, 34587, 79461}};
            int[][] actual = MultiplyMatrix.multiply(a, b);
            System.out.println("3: \t" + (Arrays.deepToString(expected).equals(Arrays.deepToString(actual))));
        }
        {
            int[][] a = { {0, 12145}, {4509, 0}, {3, 567} };
            int[][] b = { {653, 0, 25353}, {0, 61, 6} };
            int[][] expected = {{0, 740845, 72870}, {2944377, 0, 114316677}, {1959, 34587, 79461}};
            int[][] actual = MultiplyMatrix.multiply(a, b);
            System.out.println("4: \t" + (Arrays.deepToString(expected).equals(Arrays.deepToString(actual))));
        }
        {
            int[][] a = { {0, 12345}, {4509, 0}, {3, 567} };
            int[][] b = { {653, 0, 25353}, {0, 61, 4} };
            int[][] expected = {{0, 753045, 49380}, {2944377, 0, 114316677}, {1959, 34587, 78327}};
            int[][] actual = MultiplyMatrix.multiply(a, b);
            System.out.println("5: \t" + (Arrays.deepToString(expected).equals(Arrays.deepToString(actual))));
        }
        {
            int[][] a = {{30677, 22226, 98579, 29722, 99811, 75808, 69830}, {16451, 12335, 15446, 80587, 4606, 1001, 71816}, {13377, 8508, 9017, 14297, 9625, 35281, 84814}, {15583, 55032, 744, 43910, 17507, 11389, 33551}, {20736, 59730, 68865, 64273, 7336, 37991, 49340}};
            int[][] b = {{5713, 1153, 78026, 42712, 874, 40184, 21640}, {11439, 39854, 48725, 29835, 40397, 42793, 96174}, {59566, 50707, 89470, 1940, 62491, 1522, 40563}, {12081, 79616, 6822, 1187, 7102, 97830, 19018}, {65133, 76778, 3676, 99025, 69500, 74207, 75421}, {85454, 28730, 87497, 18289, 10615, 99380, 52115}, {11595, 91888, 30874, 33217, 40897, 47383, 40570}};
            int[][] expected = {{-1025541824, -1225854248, 180164818, -1390177279, 713596099, 2015974611, 202072548}, {-948006113, 1806326925, 1843142776, -238746939, 1023074300, 55486123, -1575357637}, {1213833225, -1388905192, -486432773, 980327299, 1237523992, 1963298921, -839050583}, {-499093873, 1909235207, 2065178401, 1122445713, 1009888056, -1586154770, 1180285600}, {1386672251, 22094325, -1177367019, 1642835016, 1531995488, -740142398, 1858926302}};
            int[][] actual = MultiplyMatrix.multiply(a, b);
            System.out.println("6: \t" + (Arrays.deepToString(expected).equals(Arrays.deepToString(actual))));
        }
        {
            int[][] a = {{30223, 56835, 19644, 94775, 10242, 50271, 83250}, {50896, 33397, 64875, 86787, 87164, 99285, 9075}, {52743, 5922, 32594, 99492, 92584, 32996, 62654}, {98093, 31617, 44652, 6582, 84614, 40383, 30201}, {14361, 20809, 12289, 38296, 13949, 74108, 36174}};
            int[][] b = {{93529, 66170, 97035}, {58807, 51260, 27732}, {73880, 12492, 43115}, {22497, 74823, 42124}, {78170, 49138, 82901}, {64918, 52863, 12382}, {87883, 78358, 80684}};
            int[][] expected = {{-341992105, 459174972, 356691565}, {1756369461, 1151630698, 30460631}, {-956685341, 1373285986, -1752328557}, {601016811, 640929035, 1074196571}, {531855492, -411509924, 516335491}};
            int[][] actual = MultiplyMatrix.multiply(a, b);
            System.out.println("7: \t" + (Arrays.deepToString(expected).equals(Arrays.deepToString(actual))));
        }

    }
}

