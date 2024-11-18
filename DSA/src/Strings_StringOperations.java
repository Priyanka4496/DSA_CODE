/*
Problem Description
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints
1<=N<=100000


Input Format
First argument is a string A of size N.



Output Format
Return the resultant string.



Example Input
Input 1:
A="aeiOUz"
Input 2:
A="AbcaZeoB"


Example Output
Output 1:
"###z###z"
Output 2:
"bc###bc###"


Example Explanation
Explanatinon 1:
First concatenate the string with itself so string A becomes "aeiOUzaeiOUz".
Delete all the uppercase letters so string A becomes "aeizaeiz".
Now replace vowel with '#', A becomes "###z###z".
Explanatinon 2:
First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#', A becomes "bc###bc###".

*/

import java.lang.*;
import java.util.*;

public class Strings_StringOperations {

    public static void main(String[] args) {

        // Example 1
        String input1 = "aeiOUz";
        String output1 = processString(input1);
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);

        // Example 2
        String input2 = "AbcaZeoB";
        String output2 = processString(input2);
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);
    }

    public static String processString(String A) {

        A = A + A;
        A = A.replaceAll("[A-Z]","");
        A = A.replaceAll("[aeiouAEIOU]","#");
        return A;
    }
}
