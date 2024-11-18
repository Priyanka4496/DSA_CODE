/*
Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.


Problem Constraints
1 <= N <= 100
1 <= A[i] <= 105


Input Format
First argument A is an array of integers.


Output Format
Return a 2D array of integers in any order.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [5, 2, 1, 4]


Example Output
Output 1:
[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
Output 2:
[[1], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]


Example Explanation
For Input 1:
All the subarrays of the array are returned. There are a total of 6 subarrays.
For Input 2:
All the subarrays of the array are returned. There are a total of 10 subarrays.

*/
import java.lang.*;
import java.util.*;

public class SubArray_GenerateAllSubArray
{

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!


    public static void main(String[] args) {
        // Example Input 1
        int[] input1 = {1, 2, 3};
        System.out.println("Output 1:");
        printSubArrays(allSubArrays(input1));

        // Example Input 2
        int[] input2 = {5, 2, 1, 4};
        System.out.println("\nOutput 2:");
        printSubArrays(allSubArrays(input2));
    }

    // Helper method to print 2D array
    public static void printSubArrays(int[][] subArrays) {
        for (int[] subArray : subArrays) {
            System.out.print("[");
            for (int i = 0; i < subArray.length; i++) {
                System.out.print(subArray[i]);
                if (i < subArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
public static int[][] allSubArrays(int[] A){

        int n = A.length;

        int totalArray_Size = ((n * (n + 1))/2);

        int[][] create2DArray = new int[totalArray_Size][];

        int rowOf2DArray = 0;

        for (int i=0; i<n; i++)
        {
            for (int j=i; j<n; j++)
            {
                int sizeof1DArray = (j-i+1);
                create2DArray[rowOf2DArray] = new int[sizeof1DArray]; // In 2D Array create a 1D Array and This is output format only in Row so size is RoW

                int columOf2DArray = 0;

                for (int k=i; k<=j; k++)
                {
                    create2DArray[rowOf2DArray][columOf2DArray] = A[k];
                    columOf2DArray++;
                }

                rowOf2DArray++;
            }
        }

        return create2DArray;
    }
}

