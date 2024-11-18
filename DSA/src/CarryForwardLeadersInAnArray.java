/*
Problem Description
Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 108


Input Format
There is a single input argument which a integer array A


Output Format
Return an integer array denoting all the leader elements of the array.


Example Input
Input 1:
 A = [16, 17, 4, 3, 5, 2]
Input 2:
 A = [5, 4]


Example Output
Output 1:
[17, 2, 5]
Output 2:
[5, 4]


Example Explanation
Explanation 1:
 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
Explanation 2:
 Element 5 is strictly greater than all the elements on the right side to it.
 Element 4 is strictly greater than all the elements on the right side to it.
 So we will return these two elements i.e [5, 4], we can also any other ordering.


*/
import java.lang.*;

public class CarryForwardLeadersInAnArray {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example usage:
        int[] input1 = {16, 17, 4, 3, 5, 2};
        int[] result1 = findLeaders(input1);
        System.out.print("Output 1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] input2 = {5, 4};
        int[] result2 = findLeaders(input2);
        System.out.print("Output 2: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] findLeaders(int[] A){

        int n = A.length;
        int max = A[n-1];
        int count = 1;
        for(int i = n-2; i >= 0; i--)
        {
            if(A[i] > max)
            {
                max = A[i];
                count++;
            }
        }

        int[] leaders = new int[count];
        max = A[n-1];
        leaders[0] = max;
        int j = 1;
        for(int i = n-2; i >= 0; i--)
        {
            if(A[i] > max)
            {
                max = A[i];
                leaders[j] = max;
                j++;
            }
        }
        return leaders;
    }
}

