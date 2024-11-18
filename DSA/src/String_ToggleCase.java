/*
Problem Description
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



Problem Constraints
1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format
First and only argument is a character string A.



Output Format
Return a character string.



Example Input
Input 1:

 A = "Hello"
Input 2:

 A = "tHiSiSaStRiNg"


Example Output
Output 1:

 hELLO
Output 2:

 ThIsIsAsTrInG


Example Explanation
Explanation 1:

 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O'
Explanation 2:

 "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".

*/

import java.lang.*;
import java.util.*;

public class String_ToggleCase {

    public static void main(String[] args) {

        // Example 1
        String input1 = "Hello";
        String output1 = toggleCase(input1);
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);

        // Example 2
        String input2 = "tHiSiSaStRiNg";
        String output2 = toggleCase(input2);
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);
    }

    public static String toggleCase(String A) {

        int n = A.length();

        char[] ans =  new char[n];
        ans = A.toCharArray();  // convert the current string to a character array.

        for (int i=0; i<ans.length; i++)
        {
            if ((ans[i] >= 'A') && (ans[i] <= 'Z'))
            {
                ans[i] += 32;
            }
            else
            {
                ans[i] -= 32;
            }
        }

        return new String(ans);
    }
}


