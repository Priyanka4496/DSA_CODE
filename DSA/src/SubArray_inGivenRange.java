/*
Problem Description
Given an array A of length N, return the subarray from B to C.


Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109

0 <= B <= C < N



Input Format
The first argument A is an array of integers

The remaining argument B and C are integers.



Output Format
Return a subarray


Example Input
Input 1:
A = [4, 3, 2, 6]
B = 1
C = 3
Input 2:

A = [4, 2, 2]
B = 0
C = 1


Example Output
Output 1:
[3, 2, 6]
Output 2:

[4, 2]


Example Explanation
Explanation 1:
The subarray of A from 1 to 3 is [3, 2, 6].
Explanation 2:
The subarray of A from 0 to 1 is [4, 2].


*/

import java.lang.*;
import java.util.*;

public class SubArray_inGivenRange {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int[] input1 = {4, 3, 2, 6};
        int B1 = 1;
        int C1 = 3;
        int[] output1 = getSubarray(input1, B1, C1);
        System.out.print("Output 1: [");
        for (int i = 0; i < output1.length; i++) {
            System.out.print(output1[i]);
            if (i < output1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Example 2
        int[] input2 = {4, 2, 2};
        int B2 = 0;
        int C2 = 1;
        int[] output2 = getSubarray(input2, B2, C2);
        System.out.print("Output 2: [");
        for (int i = 0; i < output2.length; i++) {
            System.out.print(output2[i]);
            if (i < output2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] getSubarray(int[] A, int B, int C)
    {
        int n = A.length;

        int[] subArray = new int[C - B + 1]; // length of subArray = (ending_index - starting_index + 1),so we used [C-B+1]

        int j = 0; //assigning starting index for new subArray from 0th index

        for(int i = B; i <= C; i++)           //running loop from starting point i.e B to ending point i.e C
        {
            subArray[j] = A[i]; //storing values t0 subArray[j]
            j++; //incrementing count of subArray index
        }

        return subArray; // returning new subarrayfrom range B to C
    }
}