/*
Problem Description
Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.



Problem Constraints
1 <= |A| <= 100000

1 <= B <= min(|A|, 500)

1 <= A[i] <= 109



Input Format
The first argument is an integer array A.

The second argument is integer B.



Output Format
Return the Bth smallest element in given array.



Example Input
Input 1:

A = [2, 1, 4, 3, 2]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 2


Example Explanation
Explanation 1:

 3rd element after sorting is 2.
Explanation 2:

 2nd element after sorting is 2.

*/


import java.lang.*;
import java.util.*;

public class Sorting_Basics_KthSmallestElement {

    public static void main(String[] args) {

        int[] input1 = {2, 1, 4, 3, 2};
        int B1 = 3;
        int result1 = findKthSmallest(input1, B1);
        System.out.println("Output 1: " + result1);

        int[] input2 = {1, 2};
        int B2 = 2;
        int result2 = findKthSmallest(input2, B2);
        System.out.println("Output 2: " + result2);
    }

    public static int findKthSmallest(final int[] A, int B) {

        //Set the elements in accending order

        Arrays.sort(A);

        return (A[B-1]);
    }
}

/*

Sort the array A in ascending order: A is sorted in ascending order.

Return the Bth element from the sorted array (A[B-1]): If B is 1, it means return the smallest element, if B is 2, return the second smallest element, and so on.

Let's say, for example, A = {4, 2, 7, 1, 9} and B = 3:

Sort the array in ascending order: A = {1, 2, 4, 7, 9}
Return the third element from the sorted array (A[3 - 1]): The third element is 4.
So, for the given input, the output would be 4. The code essentially finds the kth smallest element by sorting the array and returning the element at the (k-1) index.

*/