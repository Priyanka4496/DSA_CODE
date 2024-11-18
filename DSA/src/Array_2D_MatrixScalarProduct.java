/*
Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.


Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000

1 <= B <= 1000



Input Format
First argument is 2D array of integers A representing matrix.

Second argument is an integer B.



Output Format
You have to return a 2D array of integers after doing required operations.



Example Input
Input 1:

A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
B = 2
Input 2:
A = [[1]]
B = 5


Example Output
Output 1:
[[2, 4, 6],
[8, 10, 12],
[14, 16, 18]]
Output 2:
[[5]]


Example Explanation
Explanation 1:
==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2

==> [[2*1, 2*2, 2*3],
     [2*4, 2*5, 2*6],
     [2*7, 2*8, 2*9]]

==> [[2,   4,  6],
     [8,  10, 12],
     [14, 16, 18]]
Explanation 2:
==> ( [[1]] ) * 5

==> [[5*1]]

==> [[5]]

*/

import java.util.*;
import java.lang.*;

public class Array_2D_MatrixScalarProduct {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

        public static void printMatrix ( int[][] matrix){
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
            int B1 = 2;

            int[][] output1 = multiplyScalar(input1, B1);

            System.out.println("Output 1:");
            printMatrix(output1);

            int[][] input2 = {
                    {1}
            };
            int B2 = 5;

            int[][] output2 = multiplyScalar(input2, B2);

            System.out.println("\nOutput 2:");
            printMatrix(output2);
        }

    public static int[][] multiplyScalar(int[][] A, int B) {

            int n = A.length;
            int m = A[0].length;

            int[][] ans = new int[n][m];

            for (int i=0; i<n; i++)
            {
                for (int j=0; j<m; j++)
                {
                    ans[i][j] = A[i][j] * B;
                }
            }

            return ans;
    }
}

