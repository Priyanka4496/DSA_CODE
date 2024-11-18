/*
Problem Description
Given an array A and an integer B, find the number of occurrences of B in A.


Problem Constraints
1 <= B, Ai <= 109
1 <= length(A) <= 105


Input Format
Given an integer array A and an integer B.


Output Format
Return an integer, number of occurrences of B in A.


Example Input
Input 1:
 A = [1, 2, 2], B = 2
Input 2:
 A = [1, 2, 1], B = 3


Example Output
Output 1:
 2
Output 2:
 0

*/

import java.lang.*;
import java.util.*;

    public class MultipleOccurance {

        // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

        public static void main(String[] args) {

            int[] A1 = {1, 2, 2};  //Input 1
            int B1 = 2;

            System.out.println("Output 1 : " + MultipleCount(A1, B1));  //Function Calling

            int[] A2 = {1, 2, 1};  //Input 2
            int B2 = 3;

            System.out.println("Output 2 : " + MultipleCount(A2, B2));

        }

        public static int MultipleCount(int[] A, int B) {

            int n = A.length;
            int count = 0;
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                if (A[i] == B) {
                    count++;
                }
            }

            return count;
        }
    }
