/*
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.

*/


import java.lang.*;
import java.util.*;

public class Strings_AmazingSubarrays {

    public static void main(String[] args) {

        // Example
        String input = "ABEC";
        int output = countAmazingSubstrings(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static int countAmazingSubstrings(String A) {

        int count = 0;
        int N = A.length();
        for(int i=0; i<N; i++)
        {
            char start = A.charAt(i);
            if(start == 'a'||start == 'e'||start == 'i'||start == 'o'||start == 'u'||start == 'A'||
                    start == 'E'||start == 'I'||start == 'O'||start == 'U')
            {
                int num = N-i;  // formula
                count = (count + num) % 10003; //formula
            }
        }

        return count;
    }
}
