/*
Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.



Problem Constraints

1 <= length of the array <= 100000
-109 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return the minimum number of swaps.



Example Input

Input 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8
Input 2:

 A = [5, 17, 100, 11]
 B = 20


Example Output

Output 1:

 2
Output 2:

 1


Example Explanation

Explanation 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 Now, all elements less than or equal to 8 are together.
Explanation 2:

 A = [5, 17, 100, 11]
 After swapping 100 and 11, A => [5, 17, 11, 100].
 Now, all elements less than or equal to 20 are together.


*/

import java.util.*;
import java.lang.*;

public class SlidingWindow_MinimumSwaps {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example 1
        int[] A1 = {1, 12, 10, 3, 14, 10, 5};
        int B1 = 8;
        System.out.println("Output 1: " + minSwaps(A1, B1));

        // Example 2
        int[] A2 = {5, 17, 100, 11};
        int B2 = 20;
        System.out.println("Output 2: " + minSwaps(A2, B2));
    }

    public static int minSwaps(int[] A, int B){

        //Step 1: Counting the number of elements which are less than or equal to B
        int minCount = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] <= B)
            {
                minCount++;
            }
        }

        //Step 2: After calculating the #elements less than or equal to k
        //this count becomes the length of our sliding window.
        //counting the #elements (in var maxCount) greater B in this window
        int maxCount = 0;
        for (int i = 0; i < minCount; i++)
        {
            if (A[i] > B)
            {
                maxCount++;
            }
        }

        //Step 3: minSwap is the answer variable.
        //Initializing minSwap with maxCount for the current window
        int minSwap = maxCount;

        for (int i = minCount; i < A.length; i++)
        {

            //Checking if the current window is greater than B
            //If true then increment maxCount by 1

            if (A[i] > B)
            {
                maxCount++;
            }

            //Checking if the previous window was greater than B
            //If true then decrement maxCount by 1
            //leaving bigger element behind

            if (A[i - minCount] > B)
            {
                maxCount--;
            }

            //Checking if the current window (maxCount) or previous window is lesser
            //If maxCount (current window count) < minSwap (previous window count)
            //Then update minimum value

            minSwap = Math.min(minSwap, maxCount);

        }

        return minSwap;
    }
}


/*
Dry Run

Certainly! Let's do a dry run of the given code with a sample input. The code appears to be solving a problem related to swapping elements to make the count of elements less than or equal to a given value B in a subarray.

Let's take the input:

css
Copy code
A = {1, 3, 5, 2, 8}
B = 4
Now, let's walk through the code step by step:

Count elements less than or equal to B:

Initial array: {1, 3, 5, 2, 8}
Elements less than or equal to 4: {1, 3, 2}
minCount = 3
Count elements greater than B in the first window:

Initial window: {1, 3, 2}
Elements greater than 4: {}
maxCount = 0
Initialize minSwap with maxCount:

minSwap = 0
Iterate through the remaining windows:

Move the window one element at a time and update maxCount accordingly.

Compare and update minSwap.

Window 2: {3, 2, 8} (maxCount becomes 1, minSwap remains 0)

Window 3: {2, 8} (maxCount becomes 1, minSwap remains 0)

Window 4: {8} (maxCount becomes 1, minSwap remains 0)

Final result:

minSwap = 0 (the minimum number of swaps required to make elements less than or equal to 4)
So, for the given input, the function should return 0.
 */