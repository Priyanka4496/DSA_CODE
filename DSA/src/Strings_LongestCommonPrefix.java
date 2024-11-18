/*
Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints
0 <= sum of length of all strings <= 1000000



Input Format
The only argument given is an array of strings A.



Output Format
Return the longest common prefix of all strings in A.



Example Input
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];


Example Output
Output 1:

"a"
Output 2:

"ab"


Example Explanation
Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".
*/

import java.lang.*;
import java.util.*;

public class Strings_LongestCommonPrefix {

    public static void main(String[] args) {

        // Example 1
        String[] input1 = {"abcdefgh", "aefghijk", "abcefgh"};
        String output1 = longestCommonPrefix(input1);
        System.out.println("Input 1: " + Arrays.toString(input1));
        System.out.println("Output 1: " + output1);

        // Example 2
        String[] input2 = {"abab", "ab", "abcd"};
        String output2 = longestCommonPrefix(input2);
        System.out.println("Input 2: " + Arrays.toString(input2));
        System.out.println("Output 2: " + output2);
    }

    public static String longestCommonPrefix(String[] A) {

            int n = A.length;
            Arrays.sort(A);
            String s1 = A[0];
            String s2 = A[n-1];
            int index = 0;

            while(index < s1.length())
            {
                if (s1.charAt(index) == s2.charAt(index))
                {
                    index++;
                }
                else
                {
                    break;
                }
            }

            return s1.substring(0,index);
    }
}
