/*
Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


Problem Constraints
1 <= |A| <= 105

0 <= A[i] <= 109



Input Format
The first argument is an integer array A.



Output Format
Return the second largest element. If no such element exist then return -1.



Example Input
Input 1:

 A = [2, 1, 2]
Input 2:

 A = [2]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 First largest element = 2
 Second largest element = 1
Explanation 2:

 There is no second largest element in the array.

*/

import java.lang.*;
import java.util.*;

public class SecondLargest {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[] input1 = {2, 1, 2};
        System.out.println("Output 1: " + findSecondLargest(input1));

        // Example Input 2
        int[] input2 = {2};
        System.out.println("Output 2: " + findSecondLargest(input2));
    }

    public static int findSecondLargest(int[] A){

        int n = A.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(n < 2)
        {
            return -1;
        }

        for(int i=0; i<n; i++)
        {
            if(firstLargest < A[i])
            {
                secondLargest = firstLargest; // This check bcz by default Integer.MIN_VALUE = -2345637 value in firstlargest so I shifted in second so then after I put in first value..
                firstLargest = A[i];
            }
        }

        for(int i=0; i<n; i++)
        {
            if((A[i] != firstLargest) && (secondLargest < A[i]))
            {
                secondLargest = A[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE) // This check bcz by default Integer.MIN_VALUE = -2345637 value
        {
            return -1;
        }

        return secondLargest;

    }
}
