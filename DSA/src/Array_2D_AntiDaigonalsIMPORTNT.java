/*

Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9


Input Format
Only argument is a 2D array A of size N * N.


Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:

1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:

1 0
2 3
4 0


Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
For input 2:

The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].

*/

import java.lang.*;
import java.util.*;
import java.util.Arrays;

public class Array_2D_AntiDaigonalsIMPORTNT {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] input1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] output1 = findAntiDiagonals(input1);

        System.out.println("Output 1:");
        printMatrix(output1);

        int[][] input2 = {
                {1, 2},
                {3, 4}
        };
        int[][] output2 = findAntiDiagonals(input2);

        System.out.println("\nOutput 2:");
        printMatrix(output2);
    }

    public static int[][] findAntiDiagonals(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] result1 = new int[2 * n - 1][n];
        int row = 0;
        for (int d = 0; d < m; d++) {
            int i = 0;
            int j = d;
            int col = 0;
            while (i < n && j >= 0) {
                result1[row][col] = A[i][j];
                i++;
                j--;
                col++;
            }
            row++;

        }
        for (int d = 1; d < n; d++) {
            int i = d;
            int j = m - 1;
            int col = 0;
            while (i < n && j >= 0) {
                result1[row][col] = A[i][j];
                i++;
                j--;
                col++;
            }
            row++;
        }

        return result1;
    }
}