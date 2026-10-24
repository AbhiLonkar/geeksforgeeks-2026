package leetcode._01_arrays;

public class _36_LongestIncreasingSubsequence_300 {
    // TODO Given an integer array return the length of the longest increasing subsequence.
    // ex. {10,9,2,5,3,7,101,18} o/p - {2,5,7,101} or {2,3,7,101} so 4
    // ex. {0,1,0,3,2,3}, o/p - {0,1,2,3} so 4
    // * Topics - Array, Binary Search and DP

    // ? let's try to find the longest increasing subarray

    public static int longestIncreasingSubsq(int[] arr) {
        int n = arr.length;
        int maxLen = 1;
        int currSubArrLen = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] <= arr[i]) {
                currSubArrLen++;
                maxLen = Math.max(maxLen, currSubArrLen);
            } else {
                currSubArrLen = 1;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestIncreasingSubsq(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
