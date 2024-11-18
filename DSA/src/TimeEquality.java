/*
Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format
First argument is an integer array A.


Output Format
Return an integer denoting the minimum time to make all elements equal.


Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.


*/

import java.lang.*;
import java.util.*;

public class TimeEquality {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[] A = {2, 4, 1, 3, 2};  //Input 1

        System.out.println("Output : " + EqualityForTime(A));  //Function Calling

    }

    // In Array First all check maximum element then after each and every element
    public static int EqualityForTime(int[] A){

        int n = A.length;
        int maxElement = Integer.MIN_VALUE;
        int Subtraction = 0;
        int sum = 0;
        int element = 0;

        for (int i=0; i<n; i++)
        {
            element = A[i];

            if (element > maxElement)
            {
                maxElement = element;
            }
        }

            for(int j=0; j<n; j++)
            {
                int element2 = A[j];
                Subtraction = maxElement - element2;
                sum = sum + Subtraction;
            }

        return sum;
    }
}
