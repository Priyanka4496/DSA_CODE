/*

Problem Description
Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
First and only argument is an array of integers A.


Output Format
Return the count of elements.


Example Input
Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]


Example Output
Output 1:
2
Output 2:
1


Example Explanation
Explanation 1:
The elements that have at least 1 element greater than itself are 1 and 2
Explanation 2:
The elements that have at least 1 element greater than itself is 3

*/

import java.lang.*;
import java.util.*;

public class CountOfElementsGreatest {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example Input 1
        int[] input1 = {3, 1, 2};
        System.out.println("Output 1: " + countElementsWithGreater(input1));

        // Example Input 2
        int[] input2 = {5, 5, 3};
        System.out.println("Output 2: " + countElementsWithGreater(input2));
    }

    public static int countElementsWithGreater(int[] A) {

        int n = A.length;
        int max_Element = A[0];
        int max_count = 0;

        for (int i = 1; i < n; i++) {
            if (max_Element < A[i]) {
                max_Element = A[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (max_Element > A[i]) {
                max_count++;
            }
        }

        return max_count;
    }
}
