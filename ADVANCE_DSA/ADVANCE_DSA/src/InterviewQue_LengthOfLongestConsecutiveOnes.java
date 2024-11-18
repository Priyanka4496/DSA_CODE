/*
Amazon, Microsoft, and Facebook IMPORTANT QUESTION

Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.

Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7

*/

import java.lang.*;
import java.util.*;

public class InterviewQue_LengthOfLongestConsecutiveOnes {

    public static void main(String[] args) {

        // Test cases
        System.out.println(solve("111000"));       // Output: 3
        System.out.println(solve("111011101"));    // Output: 7
    }

    public static int solve(String A) {
//
//        char[] chars = A.toCharArray(); // Convert the string to a character array
//
//        int maxCount = 0;
//        int numsCount = 0;
//
//        for (int i=0; i<chars.length; i++) // Main numscount che je array ma count kare che
//        {
//            if(chars[i] == '1')
//            {
//                numsCount++; // if counts all ones in array then count on
//            }
//
//            if (numsCount == chars.length)
//            {
//                return chars.length; //all numscount is 1 then ans number of arrays length...
//            }
//
//            if (numsCount == 0)
//            {
//                return maxCount; //maxCount matlb jem swap ni process karye tenu logic properly
//            }
//        }
//
//        // numsCount == 0 logic is as below like max logic
//
//        for (int i=0; i<chars.length; i++)
//        {
//            int leftSide = 0;
//            int rightSide = 0;
//
//            //Now check count in array 0th left Side
//
//            int index = i-1;
//
//            while ((index >= 0) && (chars[i] == '1'))
//            {
//                index--;
//                leftSide++;
//            }
//
//            //Now check count in array 0th right Side
//
//                 index = i+1;
//
//            while ((index < chars.length) && (chars[i] == '1'))
//            {
//                index++;
//                rightSide++;
//            }
//
//            //Now total count check like if l+r==count -> count=l+r, else l+r+1 this already explain in notes
//
//            int count = 0; // New variable create and add this
//
//            if (numsCount == (leftSide + rightSide))
//            {
//                count = leftSide + rightSide;
//            }
//            else
//            {
//                count = leftSide + rightSide + 1;
//            }
//
//            //now check count and numsCount between check what is max in both side
//
//            //maxCount = Math.max(maxCount,count);
//
//            if(count > maxCount)
//            {
//                maxCount = count;
//            }
//        }
//
//        return maxCount;
//    }
//}


            char[] chars = A.toCharArray(); // Convert the string to a character array
            // 111011101
            int max = 0;
            int numsCount = 0;

            for(int i = 0; i < chars.length; i++)
            {
                if(chars[i] == '1')
                {
                    numsCount++;
                }
            }
            // only ones
            if(numsCount == chars.length)
            {
                return chars.length;
            }
            // only zeros
            if(numsCount == 0)
            {
                return max;
            }

            // numsCount == 0 logic is as below like max logic

            for(int i = 0; i < chars.length; i++)
            {
                int left = 0;
                int right = 0;
                int index = i - 1;

                if(chars[i] == '0')
                {
                    // left side
                    while(index >= 0 && chars[index] == '1')
                    {
                        left++;
                        index--;
                    }
                    // right side
                    index = i + 1;
                    while(index < chars.length && chars[index] == '1')
                    {
                        right++;
                        index++;
                    }

                    // total count checker
                    int count = 0;

                    if(numsCount == (left + right))
                    {
                        count = left + right;
                    }
                    else
                    {
                        count = left + 1 + right;
                    }
                    // max checker
                    if(count > max)
                    {
                        max = count;
                    }
                }
            }
            return max;
        }
        }
