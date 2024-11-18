/*
Problem Description
Given an array A of N integers. Construct prefix sum of the array in the given array itself.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 103


Input Format
Only argument A is an array of integers.


Output Format
Return an array of integers denoting the prefix sum of the given array.


Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [4, 3, 2]


Example Output
Output 1:

[1, 3, 6, 10, 15]
Output 2:

[4, 7, 9]


Example Explanation
Explanation 1:

The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].
Explanation 2:

The prefix sum array of [4, 3, 2] is [4, 7, 9].
*/


import java.lang.*;
import java.util.*;

public class Psum_InPlacePrefixSum {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int[] input1 = {1, 2, 3, 4, 5};
        int[] output1 = calculatePrefixSum(input1);
        System.out.print("Output 1: [");
        for (int i = 0; i < output1.length; i++) {
            System.out.print(output1[i]);
            if (i < output1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Example 2
        int[] input2 = {4, 3, 2};
        int[] output2 = calculatePrefixSum(input2);
        System.out.print("Output 2: [");
        for (int i = 0; i < output2.length; i++) {
            System.out.print(output2[i]);
            if (i < output2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] calculatePrefixSum(int[] A) {

        int n = A.length;

        int[] pSum = new int[n];
        pSum[0] = A[0];

        for (int i=1; i<n; i++)
        {
            pSum[i] = pSum[i-1] + A[i];
        }

        return pSum;
    }
}
