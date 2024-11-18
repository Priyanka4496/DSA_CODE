/*
Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing


Problem Constraints
1 <= N <= 105
1 <= Q <= 105
1 <= A[i] <= 100
0 <= B[i][0] <= B[i][1] < N


Input Format
First argument A is an array of integers.
Second argument B is a 2D array of integers.


Output Format
Return an array of integers.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [   [0,2]
        [1,4]   ]
Input 2:
A = [2, 1, 8, 3, 9]
B = [   [0,3]
        [2,4]   ]


Example Output
Output 1:
[4, 8]
Output 2:
[10, 17]


Example Explanation
For Input 1:
The subarray for the first query is [1, 2, 3] whose sum of even indices is 4.
The subarray for the second query is [2, 3, 4, 5] whose sum of even indices is 8.
For Input 2:
The subarray for the first query is [2, 1, 8, 3] whose sum of even indices is 10.
The subarray for the second query is [8, 3, 9] whose sum of even indices is 17.

*/
/*

Explanation:-

 for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
            {
                pSum[i] = pSum[i - 1] + A[i];
            }
            else
            {
                pSum[i] = pSum[i - 1];
            }
        }

Here index even sum like that
[1, 2, 3, 4, 5] --> A[0] = 1 = Even
                    A[1] = 2 = Odd
                    A[2] = 3 = Even
                    A[3] = 4 = Odd
                    A[4] = 5 = Even

                    so As per logic Ans like that ==> [1, 2, 3, 4, 5] --> Ans All even index sum --> [1, 1, 4, 4, 9]
                    so logic for Even Index sum => pSum[i] = pSum[i - 1] + A[i]
                    logic for Odd index this is else part ==> pSum[i] = pSum[i - 1]


 */

import java.lang.*;
import java.util.*;


public class Psum_SumOfEvenIndices {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {


        int[] input1A = {1, 2, 3, 4, 5};
        int[][] input1B = {{0, 2}, {1, 4}};

        int[] output1 = sumEvenIndices(input1A, input1B);
        System.out.print("Output 1: [");
        for (int i = 0; i < output1.length; i++) {
            System.out.print(output1[i]);
            if (i < output1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Example Input 2
        int[] input2A = {2, 1, 8, 3, 9};
        int[][] input2B = {{0, 3}, {2, 4}};

        int[] output2 = sumEvenIndices(input2A, input2B);
        System.out.print("Output 2: [");
        for (int i = 0; i < output2.length; i++) {
            System.out.print(output2[i]);
            if (i < output2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static int[] sumEvenIndices(int[] A, int[][] B) {

        int n = A.length;
        int[] pSum = new int[n];
        pSum[0] = A[0];

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
            {
                pSum[i] = pSum[i - 1] + A[i];
            }
            else
            {
                pSum[i] = pSum[i - 1];
            }
        }

        int m = B.length;
        int[] evenIndexSum = new int[m];

        for (int i = 0; i < m; i++) {
            int S = B[i][0];
            int E = B[i][1];

            if (S == 0) {
                evenIndexSum[i] = pSum[E];
            }
            else
            {
                evenIndexSum[i] = pSum[E] - pSum[S - 1];
            }
        }

        return evenIndexSum;
    }
}
