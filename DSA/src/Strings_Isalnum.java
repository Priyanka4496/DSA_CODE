/*
Problem Description
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



Output Format
Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.



Example Input
Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 All the characters are alphanumeric.
Explanation 2:

 All the characters are NOT alphabets i.e ('#').

*/

import java.lang.*;
import java.util.*;

public class Strings_Isalnum {

    public static void main(String[] args) {

        // Example 1
        char[] input1 = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        int output1 = isAlpha(input1);
        System.out.println("Input 1: " + new String(input1));
        System.out.println("Output 1: " + output1);

        // Example 2
        char[] input2 = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        int output2 = isAlpha(input2);
        System.out.println("Input 2: " + new String(input2));
        System.out.println("Output 2: " + output2);
    }

    public static int isAlpha(char[] A) {

        int n = A.length;

        for (int i=0; i<n; i++)
        {
            if (((A[i] >= 'A') && (A[i] <= 'Z')) || ((A[i] >= 'a') && (A[i] <= 'z')) || ((A[i] >= '0') && (A[i] <= '9')))
            {
                continue;
            }
            else
            {
                return 0;
            }
        }

        return 1;
    }
}
