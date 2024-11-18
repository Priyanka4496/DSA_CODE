/*
Problem Description
You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an long integer denoting the answer.



Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Subsequence "AG" is 3 times in given string, the pairs are (0, 3), (0, 5) and (4, 5).
Explanation 2:

 There is no subsequence "AG" in the given string.

*/

import java.lang.*;
import java.util.*;

public class CarryForward_SpecialSubseq {


    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example Input 1
        String input1 = "ABCGAG";
        System.out.println("Output 1: " + countAGPairs(input1));

        // Example Input 2
        String input2 = "GAB";
        System.out.println("Output 2: " + countAGPairs(input2));
    }

    public static long countAGPairs(String A) {

        int n = A.length();
        int Count = 0;
        int Total_Pair = 0;

        for (int i=n-1; i>=0; i--)
        {
            if(A.charAt(i) == 'G')
            {
                Count++;
            }
            else if (A.charAt(i) == 'A')
            {
                Total_Pair = Total_Pair + Count;
            }
        }

        return Total_Pair;
    }
}

