/*
Problem Description
You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.


Problem Constraints
1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the maximum possible sum of elements you removed.



Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [ 2, 3, -1, 4, 2, 1 ]
 B = 4


Example Output
Output 1:

 8
Output 2:

 9


Example Explanation
Explanation 1:

 Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2:

 Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9


*/

import java.lang.*;
import java.util.*;

public class CarryForward_PickbothsidePSUM_SSUM {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example usage:
        int[] A1 = {5, -2, 3, 1, 2};
        int B1 = 3;
        System.out.println(maxSumAfterOperations(A1, B1)); // Output: 8

        int[] A2 = {2, 3, -1, 4, 2, 1};
        int B2 = 4;
        System.out.println(maxSumAfterOperations(A2, B2)); // Output: 9
    }

    public static int maxSumAfterOperations(int[] A, int B) {

        int n = A.length;
        int[] pSum = new int[n]; //Prefix Sum
        int[] sSum = new int[n]; //Sufix Sum

        pSum[0] = A[0];
        sSum[n - 1] = A[n - 1];

        //Iterate for Prefix Sum

        for (int i = 1; i < n; i++) {
            pSum[i] = pSum[i - 1] + A[i];
        }

        //Iterate for Sufix Sum

        for (int i = n - 2; i >= 0; i--) {
            sSum[i] = sSum[i + 1] + A[i];
        }

        //Now Check Max like which sum Psum or Ssum!!

        int ans = Math.max(pSum[B - 1], sSum[n - B]); //Psum - 0 to B and Sufix sum - n to B--->Array Seq like [0...B...N]

        // iterate return the maximum possible sum of the B elements that were removed after the B operations.

        for (int i = 1; i < B; i++) {

            //This is formula psum -> pSum[i - 1] & ssum ->sSum[n - (B - i)]
            int sum = pSum[i - 1] + sSum[n - (B - i)];

            // Now find in operation Like which one is maximum sum
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}

