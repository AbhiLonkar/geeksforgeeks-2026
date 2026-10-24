package leetcode._01_arrays;

public class _12_LongestEqualSubArray_2831 {
    // TODO - Given an integer array and a number k, we have to find the longest possible subarray
    // Here k represents the number of deletions that are allowed if the subarray size can be extended.
    // ex. {1,1,1,2,1,2,1} k = 2, Here the longest subarray that can be formed is of the size 5 - {1,1,1,1,1}
    // The elements 2,2 can be deleted to extend the subarray

    // ? Use Kadane's algo, make a choice whether to extend the array or start a new one
    // ? Extend the array if the current element is equal to previous element and at the same time increment the subarray size
    // ! The tricky part comes with the deletion
    // ? For now just try to find the longest equal subarray without any deletions
    public static int LongestEqualSubArray(int[] arr){
        int maxLen = 0;
        int currSubArrayLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]==arr[i]){
                currSubArrayLen++;
                maxLen = Math.max(maxLen, currSubArrayLen);
            }
            else {
                currSubArrayLen = 1;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(LongestEqualSubArray(new int[] {1,2,2,2,2,2,3,3}));
    }
}
