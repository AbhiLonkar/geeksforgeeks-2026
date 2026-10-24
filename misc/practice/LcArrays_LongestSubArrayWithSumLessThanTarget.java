public class LcArrays_LongestSubArrayWithSumLessThanTarget {
    // TODO - Given an array find the length of the longest subarray which has sum less than target
    // ! In O(n) time

    // Using a sliding window of variable size, 2 pointers, left and right
    // Initially left will be outside till we find sum greater than target
    // In this case left will move in and remove each element at left position from the overall sum
    // For the right pointer we keep on incrementing it till we encounter a sum which is greater than target
    public static int solution(int[] arr, int target){
        int left = -1, currSum = 0, maxLen = 0;
        for (int right = 0; right<arr.length; right++){
            currSum+=arr[right];
            while (currSum>target){
                left++;
                currSum-=arr[left];
            }
            maxLen = Math.max(maxLen, right-left);
        }
        return maxLen;
    }

    public static void main(String[] args) {

    }
}
