/*
Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument A is a 2D array of integers.(2D matrix).



Output Format
Return an array containing row-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

[10,26,18]


Example Explanation
Explanation 1

Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18

*/
import java.util.*;
import java.lang.*;

public class Array_2D_RowSum {

    // THIS BELOW PART IS COMMON EACH AND EVERY CODE BCZ THIS IS A MAIN FUNCTION!!!
    public static void main(String[] args) {
        int[][] input1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}
        };

        int[] output1 = rowSums(input1);

        System.out.println("Output 1:");
        printArray(output1);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[] rowSums(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        int[] ans =  new int[n];

        for (int i=0; i<n; i++)
        {
            int sum = 0;
            for (int j=0; j<m; j++)
            {
                sum = sum + A[i][j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
