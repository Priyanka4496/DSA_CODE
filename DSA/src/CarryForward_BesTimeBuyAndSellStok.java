/*
Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.



Problem Constraints
0 <= A.size() <= 700000
1 <= A[i] <= 107



Input Format
The first and the only argument is an array of integers, A.


Output Format
Return an integer, representing the maximum possible profit.


Example Input
Input 1:
A = [1, 2]
Input 2:

A = [1, 4, 5, 2, 4]


Example Output
Output 1:
1
Output 2:

4


Example Explanation
Explanation 1:
Buy the stock on day 0, and sell it on day 1.
Explanation 2:

Buy the stock on day 0, and sell it on day 2.

*/


import java.lang.*;
import java.util.*;

public class CarryForward_BesTimeBuyAndSellStok {


    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!

    public static void main(String[] args) {

        // Example Input 1
        int[] input1 = {1, 2};
        System.out.println("Output 1: " + maxProfit(input1));

        // Example Input 2
        int[] input2 = {1, 4, 5, 2, 4};
        System.out.println("Output 2: " + maxProfit(input2));
    }

    public static int maxProfit(final int[] A) {

        int n = A.length;
        int max = Integer.MIN_VALUE;
        int Profit = 0;
        int MaximumProfit = 0;

        for (int i=n-1; i>=0; i--)
        {
            if (max < A[i])   // Find the Max value
            {
                max = A[i];
            }

            Profit = max - A[i]; //Max value - each end every elements step by step and take the profit

            if (MaximumProfit < Profit)  // comapare to all profit and which one is max this is a Ans!!
            {
               MaximumProfit = Profit;
            }
        }

        return MaximumProfit;
    }
}
