/*
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.


Problem Constraints
0 <= n <= 10^3


Input Format
Single input parameter n in function.


Output Format
Return the count of prime numbers less than or equal to n.


Example Input
Input 1:
19
Input 2:
1


Example Output
Output 1:
8
Output 2:
0


Example Explanation
Explanation 1:
Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
Explanation 2:
There are no primes <= 1


*/

import java.lang.*;
import java.util.*;

public class CountOfPrimeNumber {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        int input1 = 19;
        int input2 = 1;

        System.out.println("Output 1: " + countPrimeNo(input1));
        System.out.println("Output 2: " + countPrimeNo(input2));

    }

    public static int countPrimeNo(int A) {

        int prime = 0;
        for(int j=1; j<=A; j++)
        {
            int count=0;
            for(int i=1; i*i<=j; i++)
            {
                if(j%i==0)
                {
                    if(i*i==j)
                    {
                        count = count + 1;
                    }
                    else
                    {
                        count = count + 2;
                    }
                }
            }

            if(count==2)
            {
                prime++;
            }
        }
        return prime;
    }
}