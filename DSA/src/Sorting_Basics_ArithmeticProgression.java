/*
Problem Description
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.



Problem Constraints
2 <= N <= 105

-109 <= A[i] <= 109



Input Format
The first and only argument is an integer array A of size N.



Output Format
Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.



Example Input
Input 1:

 A = [3, 5, 1]
Input 2:

 A = [2, 4, 1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 We can reorder the elements as [1, 3, 5] or [5, 3, 1] with differences 2 and -2 respectively, between each consecutive elements.
Explanation 2:

 There is no way to reorder the elements to obtain an arithmetic progression.

*/

import java.lang.*;
import java.util.*;

public class Sorting_Basics_ArithmeticProgression {

    public static void main(String[] args) {

        int[] input1 = {3, 5, 1};
        int result1 = canFormAP(input1);
        System.out.println("Output 1: " + result1);

        int[] input2 = {2, 4, 1};
        int result2 = canFormAP(input2);
        System.out.println("Output 2: " + result2);
    }

    public static int canFormAP(int[] A) {

        int n = A.length;

        if(n < 2) // if it is lesser of 2 elements then no find a difference and return 0
        {
            return 0;
        }

        Arrays.sort(A);

        int diff = A[1] - A[0];

        for(int i=2; i<n; i++)
        {
            if(A[i] - A[i-1] != diff)  //If difference is not equal then that is not Airthmatic Progreesion
            {
                return 0;
            }
        }

        return 1;
    }
}

