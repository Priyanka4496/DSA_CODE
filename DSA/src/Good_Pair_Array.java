/*
Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.



Problem Constraints
1 <= A.size() <= 104

1 <= A[i] <= 109

1 <= B <= 109



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return 1 if good pair exist otherwise return 0.



Example Input
Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4


Example Output
Output 1:

1
Output 2:

0
Output 3:

1


Example Explanation
Explanation 1:

 (i,j) = (3,4)
Explanation 2:

No pair has sum equal to 4.
Explanation 3:

 (i,j) = (2,3)


*/
import java.lang.*;
import java.util.*;

public class Good_Pair_Array{
    public static void main(String[] args) {


        int[] A1 = {1, 2, 3, 4};  //Input 1
        int B1 = 7;

        System.out.println("Output 1: " + goodPairing(A1, B1)); // Output = 1

        int[] A2 = {1, 2, 4};  //Input 2
        int B2 = 4;

        System.out.println("Output 2: " + goodPairing(A2, B2)); // Output = 0

        int[] A3 = {1, 2, 2};  //Input 3
        int B3 = 4;

        System.out.println("Output 3: " + goodPairing(A3, B3)); // Output = 1

    }

    public  static int  goodPairing(int[] A, int B) {

        int n = A.length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if((i!=j) && (A[i] + A[j] == B))
                {
                    return 1;
                }
            }
        }

        return 0;

    }
}

