package leetcode._03_sliding_window;

public class _01_MinimumSizeSubArraySum_209 {
    // TODO - Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
    // TODO - whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
    // ! Note - sum must be greater than or equal to target
    // ! Constraints -
    // 1 <= target <= 10^9
    // 1 <= nums.length <= 10^5
    // 1 <= nums[i] <= 10^4

    // ex. target = 7, nums = [2,3,1,2,4,3], the subarrays which add upto target 7 are - [1,2,4] & [4,3] but [4,3] has the minimal length
    // so answer = [4,3]
    // ex. target = 11, nums = [3,4,4,12], the subarrays are [3,4,4] & [4,4,12], [4,12], [12]
    // The array which has element sum more than equal to target as well as minimal length is

    // * Since we're dealing with subarray its not possible to sort
    // ? Double for loop
    public static void minimumSizeSubArraySum(int[] arr, int target) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum >= target) {
                    minLen = Math.min(j - i + 1, minLen);
                    break;
                }
            }
        }
        System.out.println(minLen);
    }

    // * Lets use sliding window, we're dealing with variable size where we need to add and remove elements when certain condition is met
    // * in this problem we have to find minimal length which has sum greater than equal to target

    public static int minimumSizeSubArraySlidingWindow(int[] arr, int target) {
        int l = 0, minLen = Integer.MAX_VALUE, currSum = 0;
        for (int i = 0; i<arr.length; i++){
            // Add the current element to the rolling sum
            currSum+=arr[i];
            // when the rollingSum exceeds the target sum we need to remove elements from the left side of the subarray and move the left point forward
            while (currSum>=target){
                // Need to calculate the len which gives the length of subarray whose elements when added have sum more than or equal to target
                minLen = Math.min(minLen, i - l + 1);
                // removing left element
                currSum-=arr[l];
                // moving left pointer forward
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }

    public static void main(String[] args) {
        System.out.println(minimumSizeSubArraySlidingWindow(new int[]{1,4,4}, 4));
    }
}
