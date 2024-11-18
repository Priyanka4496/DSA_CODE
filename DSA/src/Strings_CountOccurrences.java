/*
Problem Description
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.



Problem Constraints
1 <= |A| <= 1000


Input Format
The first and only argument contains the string A, consisting of lowercase English alphabets.


Output Format
Return an integer containing the answer.


Example Input
Input 1:

  "abobc"
Input 2:

  "bobob"


Example Output
Output 1:

  1
Output 2:

  2


Example Explanation
Explanation 1:

  The only occurrence is at second position.
Explanation 2:

  Bob occures at first and third position.

*/

import java.lang.*;
import java.util.*;

public class Strings_CountOccurrences {

    public static void main(String[] args) {

        // Example 1
        String input1 = "abobc";
        int output1 = countBob(input1);
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);

        // Example 2
        String input2 = "bobob";
        int output2 = countBob(input2);
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);
    }

    public static int countBob(String A) {

        int n = A.length();
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            if ((A.charAt(i) == 'b') && (A.charAt(i + 1) == 'o') && (A.charAt(i + 2) == 'b')) {
                count++;
            }
        }

        return count;
    }
}
