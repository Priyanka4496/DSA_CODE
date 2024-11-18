/*
Problem Description
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.


Problem Constraints
1 <= N <= 105
1 <= A[i] <=109
1 <= B <= 109


Input Format
The first argument given is the integer array A.
The second argument given is the integer B.


Output Format
Return the array A after rotating it B times to the right


Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
Input 2:

A = [2, 5, 6]
B = 1


Example Output
Output 1:

[3, 4, 1, 2]
Output 2:

[6, 2, 5]

*/

import java.lang.*;
import java.util.*;

public class ArrayRotation {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int[] A1 = {1, 2, 3, 4};  //Input 1
        int B1 = 2;

        int[] Output1 = rotation(A1, B1);
        printArray(Output1); // Calling Print function

        int[] A2 = {2, 5, 6};  //Input 2
        int B2 = 1;

        int[] Output2 = rotation(A2, B2);
        printArray(Output2); // Calling Print function

    }

    static void reversePart(int[] A, int S, int E){  //Create a function for reverse logic

        int n = A.length;
        int i = S;
        int j = E;
        int temp = 0;
        while (i<j)
        {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
    public static int[] rotation(int[] A, int B){

        int n = A.length;
        B = B % n; // Rotate Matrix like B = 2 -> n = 4 so this 2%4 = 0 ,4, 8, 12 same...

        //call the function

        reversePart(A , 0 , n-1); //Array 0 to n-1 first of all reverse the array
        reversePart(A , 0 , B-1); // Array 0 to B-1 2nd is 4,3,2,1 to --> 4,3 part first reverse
        reversePart(A , B , n-1); // Array B to n-1 then 2, 1 part reverse... bcz final output is 3,4,1,2

        return  A;

    }

// THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A PRINT THE ARRAY!!!
    public static void printArray(int[] arr) //arr means new array bcz put the output value
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
