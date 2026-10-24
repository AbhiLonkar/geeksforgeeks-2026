package leetcode._01_arrays;

public class _49_MaximumSumSubArray_53 {
    // TODO - Given an integer array, we need to find the maximum sum that can be formed by a contiguous subarray

    // ? Approach - We'll use Kadane's algo, we'll keep track of global sum, inside the loop we'll keep track of local sum
    // ? This local sum will decide whether we continue the subarray or start a new one.
    // * How will it be decided? We'll check if the local sum exceeds the previous local sum, if it does extend if it doesn't start a new subarray
    // * Find the max between global and local at each iteration
    // ex. {10,2,-13,21,39}
    // Dry run - globalSum = Integer.MIN, Initial array -> [10], localSum = 10
    // 1st - localSum = 10 + 2 = 12, globalSum updated to 12
    // 2nd - localSum = 12 + (-13) = -1, it's less than previous local sum we start a new subarray with 13, global = 12
    // 3rd - localSum = -13 + 21 = 9, it's less than local sum so start a new subarray, global = 12
    // 4th - localSum = 21 + 39 = 60, it's more than previous localSum so update localSum, compare global & local so global is also updated

    public static int maximumSumSubArray(int[] arr){
        int globalSum = arr[0];
        int localSum = arr[0];
        for (int i = 1; i<arr.length; i++){
            localSum = Math.max(localSum + arr[i], arr[i]);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }
    public static void main(String[] args) {

    }

}