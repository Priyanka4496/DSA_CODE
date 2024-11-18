/*
Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.


Problem Constraints
1 <= A <= 103
1 <= B <= 109
1 <= C[i] <= 106


Input Format
The first argument is the integer A.
The second argument is the integer B.
The third argument is the integer array C.


Output Format
Return a single integer which denotes the maximum sum.


Example Input
Input 1:
A = 5
B = 12
C = [2, 1, 3, 4, 5]
Input 2:

A = 3
B = 1
C = [2, 2, 2]


Example Output
Output 1:
12
Output 2:

0


Example Explanation
Explanation 1:
We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
Explanation 2:

All elements are greater than B, which means we cannot select any subarray.
Hence, the answer is 0.

*/


import java.util.*;
import java.lang.*;

public class Slinding_WindowMaximumSumSubArray {


    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int A1 = 5;
        int B1 = 12;
        int[] C1 = {2, 1, 3, 4, 5};
        System.out.println("Output 1: " + maxSubarraySum(A1, B1, C1));

        // Example 2
        int A2 = 3;
        int B2 = 1;
        int[] C2 = {2, 2, 2};
        System.out.println("Output 2: " + maxSubarraySum(A2, B2, C2));
    }

    public static int maxSubarraySum(int A, int B, int[] C) {

        int n = C.length;
        int max = 0;

        for (int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                sum = sum + C[j];

                if((max < sum) && (sum == B))
                {
                    max = sum;
                }
            }
        }

        return max;
    }
}
