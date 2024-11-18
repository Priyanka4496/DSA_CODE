/*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.



Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N


Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.


Output Format
Return an integer array of length M where ith element is the answer for ith query in B.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:

A = [2, 2, 2]
B = [[0, 0], [1, 2]]


Example Output
Output 1:
[10, 5]
Output 2:

[2, 4]


Example Explanation
Explanation 1:
The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
Explanation 2:

The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.

*/


import java.lang.*;
import java.util.*;

public class Psum_RangeSumQuery {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[] input1A = {1, 2, 3, 4, 5};
        int[][] input1B = {{0, 3}, {1, 2}};

        long[] output1 = sumRangeQuery(input1A, input1B);
        System.out.print("Output 1: [");
        for (int i = 0; i < output1.length; i++) {
            System.out.print(output1[i]);
            if (i < output1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Example Input 2
        int[] input2A = {2, 2, 2};
        int[][] input2B = {{0, 0}, {1, 2}};

        long[] output2 = sumRangeQuery(input2A, input2B);
        System.out.print("Output 2: [");
        for (int i = 0; i < output2.length; i++) {
            System.out.print(output2[i]);
            if (i < output2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static long[] sumRangeQuery(int[] A, int[][] B) {

        int n = A.length;
        long[] pSum = new long[n];

        pSum[0] = A[0];

        for (int i=1; i<n; i++)
        {
            pSum[i] = pSum[i-1] + A[i];  //Here pSum is All Array each and every element sum TC- O(N), SC = O(N)..bcz take a extra space
        }

        int m = B.length;
        long[] rangeSum = new long[m];

        for (int i=0; i<m; i++)
        {
            int S = B[i][0];  // Two Query S = 0 and E = 1
            int E = B[i][1];

            if(S == 0)
            {
                rangeSum[i] = pSum[E];
            }
            else
            {
                rangeSum[i] = pSum[E] - pSum[S-1];
            }
        }
        return rangeSum;
    }
}

