/*
Problem Description
Given a number A. Return 1 if A is prime and return 0 if not.

Note :
The value of A can cross the range of Integer.


Problem Constraints
1 <= A <= 109


Input Format
The first argument is a single integer A.


Output Format
Return 1 if A is prime else return 0.


Example Input
Input 1:
A = 5
Input 2:

A = 10


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
5 is a prime number.
Explanation 2:

10 is not a prime number.

*/

import java.lang.*;
import java.util.*;

public class IsPrimeNumber {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int input1 = 5;
        int input2 = 10;

        System.out.println("Output 1: " + isPrime(input1));
        System.out.println("Output 2: " + isPrime(input2));

    }

    public static int isPrime(int A){

        int count = 0;
         for(int i=1; i*i<=A; i++)
         {
             if(A%i == 0)
             {
                 if(i==A/i)
                 {
                     count = count + 1;
                 }
                 else
                 {
                     count = count + 2;
                 }
             }
         }

         if (count == 2)
         {
             return 1;
         }

        return 0;
    }
}
