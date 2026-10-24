package leetcode._01_arrays;

public class _43_LongestIncreasingSubsequence_674 {
    // TODO - Given an integer array we have to find the length of the longest increasing subsequence in that array.
    // ex. [1,3,5,4,7] - Longest increasing subsequence is 1,3,5 so length is 3
    // ex. [2,2,2,2,2] - Longest increasing subsequence is 2 so length is 1
    // ex. [] - No longest increasing subsequence so length is 0
    // ex. [1] - Longest increasing subsequnce is 1 so length is 1

    // ? Approach - We'll keep 2 variables, one to track the longest subsequence found and other to track the length of the current subsequence starting with element at idx i
    // ? If currSubLen > res length we rewrite res as currSubLen
    // ? If the increasing subsequence condition broken we start a new subsequence starting with element at idx i
    // ? Keep on doing this till array end

    public static int longestIncreasingSub(int[] arr) {
        int resLen = -1;
        int currSubLen = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            // If new element lesser than previous element
            if (arr[i + 1] <= arr[i]) {
                // Rewrite resLen whenever currSubLen exceeds it
                resLen = Math.max(currSubLen, resLen);
                // Reset the currSubLen to 1, meaning start a new subArray with new element
                currSubLen = 1;
            } else {
                // Increase currSubArr length
                currSubLen++;
            }
        }
        // If we never found an increasing subsequence or we found an increasing subsequence till the array end we rewrite resLen
        return Math.max(resLen, currSubLen);
    }

    public static void main(String[] args) {
        System.out.println(longestIncreasingSub(new int[]{2, 2, 2, 2, 2}));
    }
}
