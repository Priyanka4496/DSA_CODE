/*
Problem Description
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.


Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109


Input Format
First argument A is an integer array.


Output Format
Return the sum of maximum and minimum element of the array


Example Input
Input 1:

A = [-2, 1, -4, 5, 3]
Input 2:

A = [1, 3, 4, 1]


Example Output
Output 1:

1
Output 2:

5


Example Explanation
Explanation 1:

Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
Explanation 2:

Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.

*/

import java.lang.*;
import java.util.*;

public class MaxMinArray {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[] A1 = {-2, 1, -4, 5, 3};  //Input 1

        System.out.println("Output 1 : " + MaxMinElemnt(A1));  //Function Calling

        int[] A2 = {1, 3, 4, 1};  //Input 2

        System.out.println("Output 2 : " + MaxMinElemnt(A2));

    }

    public static int MaxMinElemnt(int [] A){

        int n = A.length;
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        int sum = 0;

        int[] ans = new int[n];

        for (int i=0; i<n; i++)
        {
            int element = A[i];

            if(maxElement < element)
            {
                maxElement = element;
            }

            if (minElement > element)
            {
                minElement = element;
            }

            sum = maxElement + minElement;
        }

        return sum;
    }
}
