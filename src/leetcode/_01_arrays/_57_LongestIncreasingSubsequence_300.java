package leetcode._01_arrays;

import java.util.Arrays;

public class _57_LongestIncreasingSubsequence_300 {
    // TODO - Given an integer array we have to find the length of the longest increasing subsequence
    //  ex. [10,9,2,5,3,7,101,18] -> the longest increasing subsequence is 2,5,7,101 -> 4
    //  A subsequence is a non contiguous sequence of elements
    // ! Note -> Strictly increasing, meaning equal elements won't be counted as separate elements

    // ? We'll create a temp array to store the length of longest subsequence starting at element X
    // ? Initially it'll only have 1 ie that number itself

    // ? Let's create a loop that iterates backwards and another loop that iterates from start idx of the previous loop
    // ? If the element from the outer loop is lesser than the element from the inner loop we've got ourselves an increasing subsequence
    // ? We'll then store the maximum between the previousValue of the maxLenSubsequence[i] and 1 (element by itself) + maxLenSubsequence[j]

    // ? Then we'll simply find the max from the maxLenSubsequence

    // Lets solve for - [10,9,2,5,3,7,101,18]
    //                    0,1,2,3,4,5, 6, 7

    // * i = 7, j = 8 -> we won't enter the inner loop -> tempArray = [1,1,1,1,1,1,1,1]

    // * i = 6
    //      j = 7 -> we won't enter if condition -> tempArray = [1,1,1,1,1,1,1,1]

    // * i = 5 (7),
    //      j = 6 (101) -> enter if condition and update tempArray = [1,1,1,1,1,2,1,1]
    //      j = 7 (18) -> enter if condition and update tempArray = [1,1,1,1,1,2,1,1] -> No change since max(2,2) = 2

    // * i = 4 (3)
    //      j = 5 (7) -> enter if condition and update tempArray = [1,1,1,1,(1+2),2,1,1] = [1,1,1,1,3,2,1,1]
    //      j = 6 (101) -> enter if condition, but since max(3, 1+1) = 3 tempArray remains same
    //      j = 7 (18) -> enter if condition but since max(3,1+1) = 3 tempArray remains same

    // * i = 3 (5)
    //      j = 4 (3) -> do not enter if as 5>3
    //      j = 5 (7) -> enter if, max (1, 1+3) = 4 update temp -> [1,1,1,4,3,2,1,1]
    //      j = 6 (101) -> enter if max (4, 1+2) = 4 no need to update as its already been set to max
    //      j = 7 (18) -> same as above

    // So we keep on doing this till we reach the first element

    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] maxLenSubsequenceForEveryElement = new int[n];
        Arrays.fill(maxLenSubsequenceForEveryElement, 1);
        for (int i = n - 1; i >= 0; i--) {
            int currEl = arr[i];
            for (int j = i + 1; j < n; j++) {
                int nextEl = arr[j];
                if (nextEl > currEl) {
                    maxLenSubsequenceForEveryElement[i] = Math.max(maxLenSubsequenceForEveryElement[i], 1 + maxLenSubsequenceForEveryElement[j]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : maxLenSubsequenceForEveryElement) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestIncreasingSubsequence(new int[]{10,9,2,5,3,7,101,18}));
    }
}
