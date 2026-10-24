package leetcode._01_arrays;

public class _35_LongestEvenOddSubarrayThreshold_2760 {
    // TODO - Given an integer array and threshold k we have to find the maximum length of an even odd subarray that can be formed
    // And all the elements in the subarray must be less than k
    // ! Subarray should be contiguous

    // ? Approach - Find the starting point, this starting point must be even and less and the threshold. When we find it
    // ? initialize the end point which starts at start+1 index, end must keep on increasing till the odd even and the threshold condition
    // ? breaks or we've reached array end.
    // ? We then compare maxLen with the currSubArrLen

    public static int getSubArrayLen(int[] arr, int threshold) {
        int maxLen = 0;
        int currSubArrLen = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= threshold) {
                currSubArrLen = 1;
                int end = i + 1;
                while (end < n && arr[end] % 2 != arr[end - 1] % 2 && arr[end] <= threshold) {
                    end++;
                    currSubArrLen++;
                }
                maxLen = Math.max(maxLen, currSubArrLen);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(getSubArrayLen(new int[]{2, 2}, 2));
    }
}
