/*
Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument is a 2D array of integers.(2D matrix).



Output Format
Return an array containing column-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

{15,10,13,16}


Example Explanation
Explanation 1

Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16



*/


import java.lang.*;
import java.util.*;

public class Array_2D_ColumnSUM {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}
        };

        int[] result = columnSums(matrix);

        // Printing the result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Output: [15, 10, 13, 16]

    }

    public static int[] columnSums(int[][] A){

            int n = A.length;  //For Row
            int m = A[0].length; //For Column

            int[] ans = new int[m];

            for (int i=0; i<m; i++)  //Iterate for column
            {
                for (int j=0; j<n; j++) //Iterate for Row
                {
                    ans[i] = ans[i] + A[j][i]; // A[Row][Column] ==> A[j][i]
                }
            }

            return ans;
    }
}
