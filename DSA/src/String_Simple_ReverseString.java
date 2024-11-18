/*
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:

Reverse the given string.

*/


import java.lang.*;
import java.util.*;

public class String_Simple_ReverseString {

    public static void main(String[] args) {

        // Example 1
        String input1 = "scaler";
        String output1 = reverseString(input1);
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);

        // Example 2
        String input2 = "academy";
        String output2 = reverseString(input2);
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);
    }

    public static String reverseString(String A) {

        int n = A.length();
        char[] ch = A.toCharArray();  // convert the current string to a character array.

        int start = 0;
        int end = n-1;

        while (start<end)
        {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] =  temp;

            start++;
            end--;
        }

        return new String(ch);
    }
}

