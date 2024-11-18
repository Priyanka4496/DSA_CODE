/*
Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



Problem Constraints
1 <= |A| <= 2*105
-108 <= A[i] <= 108


Input Format
First and only argument is an integer array A.



Output Format
Return 1 if any such integer p is present else, return -1.



Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output
Output 1:

 1
Output 2:

-1


Example Explanation
Explanation 1:

 For integer 2, there are 2 greater elements in the array..
Explanation 2:

There exist no integer satisfying the required conditions.

*/

import java.lang.*;
import java.util.*;

public class Sorting_Basics_NobleInteger {

    public static void main(String[] args) {

        int[] input1 = {3, 2, 1, 3};
        int result1 = findIntegerP(input1);
        System.out.println("Output 1: " + result1);

        int[] input2 = {1, 1, 3, 3};
        int result2 = findIntegerP(input2);
        System.out.println("Output 2: " + result2);
    }

    public static int findIntegerP(int[] A) {

        // First of all elements are arranged in incending order

        Arrays.sort(A); // Arrange in order in accending order

        reverseArray(A); // Function calling Element Swapping

        int n = A.length;
        int count = 0;

        if(A[0] == 0)
        {
            return 1;
        }

        for(int i=1; i<=n-1; i++)
        {
            if(A[i] != A[i-1])
            {
                count = i;
            }

            if(count == A[i])
            {
                return 1;
            }
        }

        return -1;

    }

    public static void reverseArray(int A[]){      // Create a function for the reverse part

        int s = 0;
        int e = A.length-1;
        while(s < e)
        {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;

            s++;
            e--;
        }
    }
}