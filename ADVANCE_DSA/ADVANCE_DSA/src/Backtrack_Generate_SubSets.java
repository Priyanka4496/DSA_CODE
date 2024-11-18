/*
Problem Description

Given a set of distinct integers A, return all possible subsets that can be formed from the elements of array A.



Problem Constraints
1 ≤ |A| ≤ 16

INT_MIN ≤ A[i] ≤ INT_MAX

Array A is given in increasing order.

All elements of array A are distinct.



Input Format
First and only argument of input contains a single integer array A.



Output Format
Return a vector of vectors denoting the answer in any order.



Example Input
Input 1:

A = [1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]


Example Explanation
Explanation:

You can see that these are all possible subsets.

*/
import java.util.*;

public class Backtrack_Generate_SubSets
{
    // Method to generate all possible subsets of a given set of distinct integers
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        // Initialize the ArrayList to store the final result
        ArrayList<ArrayList<Integer>> FinalResult = new ArrayList<>();

        // Initialize an ArrayList to store the current subset being generated
        ArrayList<Integer> NoOfSubsets = new ArrayList<>();

        // Call the recursive function to generate subsets
        findSubsets(A, FinalResult, NoOfSubsets, 0);

        // Return the final result
        return FinalResult;
    }

    // Recursive function to generate subsets
    public void findSubsets(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> FinalResult, ArrayList<Integer> NoOfSubsets, int Index)
    {
        // Base case: If Index reaches the end of the array, add the current subset to the final result
        if (Index == A.size())
        {
            FinalResult.add(new ArrayList<>(NoOfSubsets));
            return;
        }

        // Exclude the current element and move to the next index
        findSubsets(A, FinalResult, NoOfSubsets, Index + 1);

        // Include the current element in the subset
        NoOfSubsets.add(A.get(Index));

        // Recursively generate subsets with the current element included
        findSubsets(A, FinalResult, NoOfSubsets, Index + 1);

        // Backtrack: Remove the current element to backtrack to the previous state
        NoOfSubsets.remove(NoOfSubsets.size() - 1);
    }

    // Main method to test the code
    public static void main(String[] args)
    {
        // Create an instance of the Backtrack_Generate_SubSets class
        Backtrack_Generate_SubSets subsets = new Backtrack_Generate_SubSets();

        // Define the input sets
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        // Generate subsets for the input sets
        ArrayList<ArrayList<Integer>> result1 = subsets.subsets(nums1);
        System.out.println("Output 1:");

        // Print the subsets
        printResult(result1);

        ArrayList<ArrayList<Integer>> result2 = subsets.subsets(nums2);
        System.out.println("Output 2:");

        // Print the subsets
        printResult(result2);
    }

    // Utility method to print the subsets
    private static void printResult(ArrayList<ArrayList<Integer>> result) {
        System.out.println("[");
        for (List<Integer> subset : result) {
            System.out.print(" ");
            System.out.println(subset);
        }
        System.out.println("]");
    }
}
