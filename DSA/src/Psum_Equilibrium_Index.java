/*
Problem Description
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.


Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105


Input Format
First arugment is an array A .


Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.


Example Input
Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:
3
Output 2:

-1


Example Explanation
Explanation 1:
i    Sum of elements at lower indexes    Sum of elements at higher indexes
              left sum                           right sum
0                   0                                   7
1                  -7                                   6
2                  -6                                   1
3                  -1                                  -1
4                   1                                   3
5                  -3                                   0
6                   0                                   0

3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Explanation 1:

i   Sum of elements at lower indexes    Sum of elements at higher indexes
0                   0                                   5
1                   1                                   3
2                   3                                   0
Thus, there is no such index.

*/


import java.lang.*;
import java.util.*;

public class Psum_Equilibrium_Index {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[] input1 = {-7, 1, 5, 2, -4, 3, 0};
        int result1 = findEquilibriumIndex(input1);
        System.out.println("Output 1: " + result1);

        int[] input2 = {1, 2, 3};
        int result2 = findEquilibriumIndex(input2);
        System.out.println("Output 2: " + result2);
    }

    public static int findEquilibriumIndex(int[] A)
    {

        int n = A.length;
        long[] Psum = new long[n];

        Psum[0] = A[0];

        for(int i=1; i<n; i++)
        {
            Psum[i] = Psum[i-1] + A[i];
        }

        int ans = -1;
        long rightSum = 0;
        long leftSum = 0;

        for(int i=0; i<n; i++)
        {
            if(i==0)
            {
                leftSum = 0;     //leftSum = 0 to i-1
            }
            else
            {
                leftSum = Psum[i-1];
            }

            rightSum = Psum[n-1] - Psum[i];  // rightSum = i+1 to n-1

            // Now compare to leftSum and rightSum bcz now I want to get Equilibrium Index

            if(leftSum == rightSum)
            {
                ans = i;
                break;
            }
        }

        return ans;
    }
}
