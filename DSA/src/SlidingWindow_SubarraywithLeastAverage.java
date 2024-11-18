/*
Problem Description
Given an array A of size N, find the subarray of size B with the least average.



Problem Constraints
1 <= B <= N <= 105
-105 <= A[i] <= 105


Input Format
First argument contains an array A of integers of size N.
Second argument contains integer B.


Output Format
Return the index of the first element of the subarray of size B that has least average.
Array indexing starts from 0.


Example Input
Input 1:
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
Input 2:

A = [3, 7, 5, 20, -10, 0, 12]
B = 2


Example Output
Output 1:
3
Output 2:

4


Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average
among all subarrays of size 3.
Explanation 2:

 Subarray between [4, 5] has minimum average

*/

import java.util.*;
import java.lang.*;

public class SlidingWindow_SubarraywithLeastAverage {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[] A1 = {3, 7, 90, 20, 10, 50, 40};
        int B1 = 3;

        System.out.println(findSubarrayWithLeastAverage(A1, B1)); // Output: 3

        int[] A2 = {3, 7, 5, 20, -10, 0, 12};
        int B2 = 2;
        System.out.println(findSubarrayWithLeastAverage(A2, B2)); // Output: 4
    }

    public static int findSubarrayWithLeastAverage(int[] A, int B){

        int N = A.length;
        double sum = 0;
        double Avg = 0;
        double subArray_Sum = 0;
        int index = 0;
        double subArray_Avg = 0;

        //Now create B size subarray sum

        for (int i=0; i<B; i++)
        {
            sum = sum + A[i];
        }

            Avg = sum/B;

        //Now Apply Sliding Window Formula
        int S = 1;
        int E = B;

        while (E<N)
        {
            subArray_Sum = sum - A[S-1] + A[E];  // Sliding Window Formula
            subArray_Avg = subArray_Sum/(double)B; //Here using double datatype bcz avg ans is point value....so!!

            if (Avg > subArray_Avg)  // Compare to minimum avg
            {
                Avg = subArray_Avg;
                index = S; //bcz start next step by step...
            }
            S++;
            E++;
        }

        return index;
    }
}


/*
Dry Run:-

Certainly! Let's do a dry run of the given code with a small example:

Suppose we have the following input:

java
Copy code
int[] A = {3, 7, 5, 20, -10, 0, 12};
int B = 2;
Now let's go through the code step by step:

Initialize variables:

N: Length of array A (7 in this case).
sum, Avg: Variables to calculate the average of the initial subarray of size B.
subArray_Sum, subArray_Avg: Variables to calculate the average of the sliding subarray.
index: Variable to store the starting index of the subarray with the least average.
Calculate the sum and average of the initial subarray of size B:

sum = 3 + 7 = 10
Avg = 10 / 2 = 5.0
Apply the sliding window formula using a while loop:

Initialize S (start) and E (end) to 1 and B, respectively.
Inside the while loop:

Calculate the sum of the current sliding subarray using the sliding window formula:
css
Copy code
subArray_Sum = sum - A[S-1] + A[E] = 10 - 3 + (-10) = -3
Calculate the average of the current subarray:
makefile
Copy code
subArray_Avg = -3 / 2 = -1.5
Compare the average of the current subarray with the overall minimum average (Avg).
In the first iteration, Avg is 5.0, and subArray_Avg is -1.5, so we update Avg and set index to S (which is 1).
Increment S and E and repeat the process:

In the second iteration, the sliding window moves to the next subarray.
Calculate the new subarray sum and average.
Compare the new average with the current minimum average and update if necessary.
Repeat until the end of the array is reached.
The final result is the starting index of the subarray with the least average, which is returned by the function.

Let's calculate the result:

java
Copy code
findSubarrayWithLeastAverage(A, B);
The function should return index = 4, as the subarray [4, 5] has the least average among all subarrays of size 2 in the given example.


 */