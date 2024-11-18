/*
Problem Description
Given an array A of length N. Also given are integers B and C.

Return 1 if there exists a subarray with length B having sum C and 0 otherwise



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 104

1 <= B <= N

1 <= C <= 109



Input Format
First argument A is an array of integers.

The remaining arguments B and C are integers



Output Format
Return 1 if such a subarray exist and 0 otherwise


Example Input
Input 1:
A = [4, 3, 2, 6, 1]
B = 3
C = 11
Input 2:

A = [4, 2, 2, 5, 1]
B = 4
C = 6


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
The subarray [3, 2, 6] is of length 3 and sum 11.
Explanation 2:
There are no such subarray.


*/

import java.util.*;
import java.lang.*;

public class SlindingWindow_SubarraywithGivenSum_Length {


    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int[] A1 = {4, 3, 2, 6, 1};
        int B1 = 3;
        int C1 = 11;
        System.out.println("Output 1: " + subarraySumExists(A1, B1, C1));

        // Example 2
        int[] A2 = {4, 2, 2, 5, 1};
        int B2 = 4;
        int C2 = 6;
        System.out.println("Output 2: " + subarraySumExists(A2, B2, C2));

    }

    public static int subarraySumExists(int[] A, int B, int C) {

          int n = A.length;
          int sum = 0;

          // Sum of 0 to upto B...
        for (int i=0; i<B; i++)
        {
            sum = sum + A[i];
        }

        //Now Apply Sliding Window Technique...Already explain in Manpreet Notes

        int s = 1;
        int e = B;

        while(e < n)
        {
            //Apply Formula of Sliding Window

            sum = sum - A[s-1] + A[e]; //Step by step using this technique upto B

            //Now compare sum and C as According Que

            if(sum == C)
            {
                return 1;
            }
            // s and e both are increase...bcz this technique is sliding window so it is step by step follow next element
            s++;
            e++;
        }

        return 0;
    }
}
