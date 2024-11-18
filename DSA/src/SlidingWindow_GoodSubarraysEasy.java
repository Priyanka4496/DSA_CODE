/*
Problem Description
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.


Problem Constraints
1 <= len(A) <= 5 x 103
1 <= A[i] <= 103
1 <= B <= 107


Input Format
The first argument given is the integer array A.
The second argument given is an integer B.


Output Format
Return the count of good subarrays in A.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = 4
Input 2:

A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65


Example Output
Output 1:
6
Output 2:

36


Example Explanation
Explanation 1:
Even length good subarrays = {1, 2}
Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}
Explanation 1:
There are 36 good subarrays

*/



import java.util.*;
import java.lang.*;

public class SlidingWindow_GoodSubarraysEasy {


    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int[] A1 = {1, 2, 3, 4, 5};
        int B1 = 4;
        System.out.println("Output 1: " + countGoodSubarrays(A1, B1));

        // Example 2
        int[] A2 = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B2 = 65;
        System.out.println("Output 2: " + countGoodSubarrays(A2, B2));

    }

    public static int countGoodSubarrays(int[] A, int B){

        int n  = A.length;
        int count = 0;

        //This two for loop create for find the all subarray
        for (int i=0; i<n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum = sum + A[j]; // This is all subarray sum

                // Now each every odd and even length subarray length is Ending-Starting + 1 => (E-S+1)

                int m = j - i + 1;

                //Now find the length like ODD or EVEN and check like is greater ya lesser as per according Que

                if ((m % 2 == 0) && (sum < B)) // This for EVEN
                {
                    count++;
                }
                else if ((m % 2 != 0) && (sum > B)) // This for ODD
                {
                    count++;
                }
            }
        }

        return count;
    }
}
