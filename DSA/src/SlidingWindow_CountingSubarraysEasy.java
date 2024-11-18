/*
Problem Description
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.



Problem Constraints
1 <= N <= 5 x 103

1 <= A[i] <= 1000

1 <= B <= 107



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the number of subarrays in A having sum less than B.



Example Input
Input 1:

 A = [2, 5, 6]
 B = 10
Input 2:

 A = [1, 11, 2, 3, 15]
 B = 10


Example Output
Output 1:

 4
Output 2:

 4


Example Explanation
Explanation 1:

 The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
Explanation 2:

 The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}


*/


import java.util.*;
import java.lang.*;

public class SlidingWindow_CountingSubarraysEasy {


    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int[] A1 = {2, 5, 6};
        int B1 = 10;
        System.out.println("Output 1: " + countSubarraysWithSumLessThanB(A1, B1));

        // Example 2
        int[] A2 = {1, 11, 2, 3, 15};
        int B2 = 10;
        System.out.println("Output 2: " + countSubarraysWithSumLessThanB(A2, B2));
    }

    public static int countSubarraysWithSumLessThanB(int[] A, int B){

        int n = A.length;
        int count = 0;

        //Iterate both for loop all subArray and Sum
        for (int i=0; i<n; i++)
        {
            int sum = 0;
            for (int j=i; j<n; j++)
            {
                sum =  sum + A[j];

                //Now Apply Condition as according Que

                if (sum < B)
                {
                    count++;
                }
            }
        }

        return count;
    }
}
