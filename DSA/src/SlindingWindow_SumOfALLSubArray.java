/*

Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.



Problem Constraints
1 <= N <= 105
1 <= Ai <= 104


Input Format
The first argument is the integer array A.


Output Format
Return a single integer denoting the sum of all subarray sums of the given array.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:

A = [2, 1, 3]


Example Output
Output 1:
20
Output 2:

19


Example Explanation
Explanation 1:
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
Explanation 2:

The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19

*/


import java.util.*;
import java.lang.*;

public class SlindingWindow_SumOfALLSubArray {


    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int[] A1 = {1, 2, 3};
        System.out.println("Output 1: " + sumOfSubarraySums(A1));

        // Example 2
        int[] A2 = {2, 1, 3};
        System.out.println("Output 2: " + sumOfSubarraySums(A2));
    }

    public static long sumOfSubarraySums(int[] A){

        /*
        This formula method check in Manpreet Notes
        Formula Of sum of subarray => (n-i) + (n-i)*i  = (i+1)(n-i)

        For arr[] = {1, 2, 3}, sum of subarrays is:

Code Formula logic ==>    arr[0] * ( 0 + 1 ) * ( 3 – 0 ) +
                          arr[1] * ( 1 + 1 ) * ( 3 – 1 ) +
                          arr[2] * ( 2 + 1 ) * ( 3 – 2 )

                          arr[i]*(i+1)*(n-i) + ....

        = 1*3 + 2*4 + 3*3
        = 20

         */

        int n = A.length;
        long total_Sum = 0;

        for (int i=0; i<n; i++)
        {
            long equation = ((long)(i+1)*(n-i)); //Equation for each and element subarray
            long multiplication_with_Element = equation * A[i]; // Multiplication of each and every element
            total_Sum = total_Sum + multiplication_with_Element; //Overall Sum
        }

        return total_Sum;
    }
}

