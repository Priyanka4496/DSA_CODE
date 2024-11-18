/*
Q1. NQueens

Problem Description
The N-queens puzzle is the problem of placing N queens on an N×N chessboard such that no two queens attack each other.

Given an integer A denoting the value of N, return all distinct solutions to the N-queens puzzle.

Each solution contains a distinct board configuration of the N-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.

Problem Constraints
1 <= A <= 10

Input Format
First argument is an integer A denoting the size of chessboard

Output Format
Return an array consisting of all distinct solutions in which each element is a 2d char array representing a unique solution.

Example Input
Input 1:

A = 4
Input 2:

A = 1


Example Output
Output 1:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
Output 1:

[
 [Q]
]


Example Explanation
Explanation 1:

There exist only two distinct solutions to the 4-queens puzzle:
Explanation 1:

There exist only one distinct solutions to the 1-queens puzzle:

*/

import java.util.ArrayList;

public class Backtrack_NQUEEN_inStringFormat {

    // Method to solve N-Queens problem
    public ArrayList<ArrayList<String>> solveNQueens(int A) {

        // N*N array to represent the chessboard
        int [][]mat = new int[A][A];

        // ArrayList to store all possible solutions
        ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();

        // Calling NQueen function to iterate and find all possible solutions
        NQueen(mat, A, 0, ans);

        // Return the final solution arraylist output
        return ans;
    }

    // Recursive function to place queens on the chessboard
    public void NQueen(int[][] mat, int N, int i, ArrayList<ArrayList<String>> ans) {
        // Base case: when i reaches the size of board, all queens are placed
        if(i == N)
        {
            // ArrayList to store the solution configuration
            ArrayList<String> list = new ArrayList<String>();

            // Convert int array to String arraylist
            for(int row = 0; row < N; row++)
            {
                // String variable to attach each element in rows as string
                String str = "";

                for(int col = 0; col < N; col++)
                {
                    // Check if 1 is present at element then concatenate "Q", otherwise concatenate "."
                    str = str + (mat[row][col] == 1? 'Q':'.');
                }

                // Add row wise string in 1D list array
                list.add(str);
            }

            // Add the solution configuration to the final answer arraylist
            ans.add(list);
            return;
        }

        // Iterate through all elements in every column to explore all possible queen placements
        for(int j = 0; j < N; j++)
        {
            if(isValid(mat, i, j))
            {
                mat[i][j] = 1; // Place queen at position (i, j)
                NQueen(mat, N, i+1, ans); // Recursively call NQueen to place next queen
                mat[i][j] = 0; // Backtrack: remove the queen from position (i, j)
            }
        }
    }

    // Method to check if a queen can be placed at position (i, j)
    public boolean isValid(int[][] mat, int i, int j)
    {
        int row = i, col = j, N = mat.length;

        // Column checks: check for any queen in the same column
        while(i >= 0 && j >= 0 && j < N)
        {
            if(mat[i][j] == 1)
            {
                return false;
            }
            i--;
        }

        // Left diagonal checks: check for any queen in the same left diagonal
        i = row; j = col;
        i--; j--;
        while(i >= 0 && j >= 0)
        {
            if(mat[i][j] == 1)
            {
                return false;
            }
            i--; j--;
        }

        // Right diagonal checks: check for any queen in the same right diagonal
        i = row; j = col;
        i--; j++;
        while(i >= 0 && j < N)
        {
            if(mat[i][j] == 1)
            {
                return false;
            }
            i--; j++;
        }

        // If all cells are empty, return true indicating current cell is appropriate to store a queen
        return true;
    }

    // Main function to test the N-Queens problem
    public static void main(String[] args)
    {
        Backtrack_NQUEEN_inStringFormat solution = new Backtrack_NQUEEN_inStringFormat();
        int A = 4; // Example: A = 4 for a 4x4 chessboard
        ArrayList<ArrayList<String>> solutions = solution.solveNQueens(A);
        // Printing all solutions
        for (ArrayList<String> sol : solutions)
        {
            System.out.println("Solution:");
            for (String row : sol)
            {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
