/*
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).



Problem Constraints
1 <= N <= 103

-1000 <= A[i][j] <= 1000



Input Format
First and only argument is a 2D integer matrix A.



Output Format
Return an integer denoting the sum of minor diagonal elements.



Example Input
Input 1:

 A = [[1, -2, -3],
      [-4, 5, -6],
      [-7, -8, 9]]
Input 2:

 A = [[3, 2],
      [2, 3]]


Example Output
Output 1:

 -5
Output 2:

 4


Example Explanation
Explanation 1:

 A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
Explanation 2:

 A[1][2] + A[2][1] = 2 + 2 = 4

*/
import java.util.*;
import java.lang.*;

public class Array_2D_MinorDiagonalSum {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!
    public static void main(String[] args) {

        int[][] input1 = {
                {1, -2, -3},
                {-4, 5, -6},
                {-7, -8, 9}
        };

        int result1 = findMinorDiagonalSum(input1);

        System.out.println("Output 1:");
        System.out.println(result1);

        int[][] input2 = {
                {3, 2},
                {2, 3}
        };

        int result2 = findMinorDiagonalSum(input2);

        System.out.println("\nOutput 2:");
        System.out.println(result2);
    }

    public static int findMinorDiagonalSum(final int[][] A) {

        int n = A.length;

        int i = 0;
        int j = n-1;
        int sum = 0;

        while ((i < n) && (j >= 0))
        {
            sum = sum + A[i][j];

            i++;
            j--;
        }

        return sum;
    }
}
