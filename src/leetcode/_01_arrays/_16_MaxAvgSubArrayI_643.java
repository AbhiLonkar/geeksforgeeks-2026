package leetcode._01_arrays;

public class _16_MaxAvgSubArrayI_643 {
    // TODO - Given an integer array return the max avg that a subarray of size k can give
    // ex - nums = [1,12,-5,-6,50,3], k = 4

    // ? Since I know the size of the subarray(taking avg means I only need sum) all I have to do is find the maxSum of the subarray of size k
    public static double MaxAvgSubarray(int[] arr, int k) {
        int currSubArraySum = 0;
        for (int i = 0; i < k; i++) {
            currSubArraySum += arr[i];
        }
        int maxSum = currSubArraySum;
        for (int i = k; i < arr.length; i++) {
            currSubArraySum = currSubArraySum + arr[i] - arr[i - k];
            maxSum = Math.max(currSubArraySum, maxSum);
        }
        return (double) maxSum/k;
    }

    public static void main(String[] args) {
        System.out.println(MaxAvgSubarray(new int[] {1,12,-5,-6,50,3}, 4));
    }
}
