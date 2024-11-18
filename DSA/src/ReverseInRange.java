/*

Problem Description
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C <= N - 1


Input Format
The first argument A is an array of integer.
The second and third arguments are integers B and C


Output Format
Return the array A after reversing in the given range.


Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:

A = [2, 5, 6]
B = 0
C = 2


Example Output
Output 1:

[1, 2, 4, 3]
Output 2:

[6, 5, 2]


Example Explanation
Explanation 1:

We reverse the subarray [3, 4].
Explanation 2:

We reverse the entire array [2, 5, 6].

*/

import java.lang.*;
import java.util.*;

public class ReverseInRange {
    public static void main(String[] args) {

        int[] A1 = {1, 2, 3, 4};  //Input 1 Here [B,C] Means between index of 2 to index of 3 element reverse!!
        int B1 = 2;
        int C1 = 3;

       int[] Output1 = reverseRange(A1, B1, C1);
       printArray(Output1); // Calling Print function

        int[] A2 = {2, 5, 6};  //Input 2
        int B2 = 0;
        int C2 = 2;

        int[] Output2 = reverseRange(A2, B2, C2);
        printArray(Output2); // Calling Print function

    }

    public static int[] reverseRange(int[] A, int B, int C)
    {
        int n = A.length;

        int temp;
        int i = B;
        int j = C;

        while(i<j)
        {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }

        return A;
    }

    public static void printArray(int[] arr) //arr means new array bcz put the output value
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
