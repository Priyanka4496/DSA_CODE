/*
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output
Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation
Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".

*/

import java.lang.*;
import java.util.*;

public class String_LongestPalindromicSubstring {

    public static void main(String[] args) {

        // Example 1
        String input1 = "aaaabaaa";
        String output1 = longestPalindrome(input1);
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);

        // Example 2
        String input2 = "abba";
        String output2 = longestPalindrome(input2);
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);
    }

    public static String longestPalindrome(String A) {

        int n = A.length();
        int even = 0;
        int odd = 0;
        int startOdd = 0;
        int startEven = 0;

        for (int i = 0; i < n; i++)
        {
            // Odd length palindrome
            int p1 = i, p2 = i;
            while ((p1 >= 0) && (p2 < n))
            {
                if (A.charAt(p1) == A.charAt(p2))
                {
                    p1--;
                    p2++;
                }
                else
                {
                    break;
                }
            }

            int length = p2 - p1 - 1;
            if (length > odd)
            {
                odd = length;
                startOdd = p1 + 1;
            }
        }

        for (int i = 0; i < n; i++)
        {
            // Even length palindrome
            int p1 = i, p2 = i + 1;
            while ((p1 >= 0) && (p2 < n))
            {
                if (A.charAt(p1) == A.charAt(p2))
                {
                    p1--;
                    p2++;
                }
                else
                {
                    break;
                }
            }

            int length = p2 - p1 - 1;
            if (length > even)
            {
                even = length;
                startEven = p1 + 1;
            }
        }

        // Return the longest palindrome substring
        if (odd > even)
        {
            return A.substring(startOdd, startOdd + odd);
        }
        else
        {
            return A.substring(startEven, startEven + even);
        }
    }
}