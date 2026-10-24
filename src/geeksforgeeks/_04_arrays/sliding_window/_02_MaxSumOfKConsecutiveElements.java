package geeksforgeeks._04_arrays.sliding_window;

public class _02_MaxSumOfKConsecutiveElements {
    // TODO Given an integer array find the subarray with length = k which gives out the max sum and return that sum
    // ex. [10,20,-10,30,40,-5] k = 3, possible sub-arrays of length k are - [10,20,-10] [20,-10,30] [-10,30,40] [30,40,-5]
    // the sub-array with most sum is [30, 40, -5] = 65

    // ? Try to form a sub-array of length k starting with ith element
    public static int maxSumKConsecutiveElements(int[] arr, int k) {
        int res = Integer.MIN_VALUE;
        // Loop to control where the subarray starts
        for (int i = 0; i <= arr.length - k; i++) { // Ensures to form a subarray with only k items, helps with out of bounds indices
            int currSubArrSum = 0;
            // Loop to iterate over exactly k elements starting with index i
            for (int j = i; j < i + k; j++) {
                currSubArrSum += arr[j];
            }
            res = Math.max(res, currSubArrSum);
        }
        return res;
    }

    // ? Using sliding window
    // ? The basic idea behind this is that, first we find the sum of the first k elements and store it in windowSum
    // ? This serves as the initial window
    // ? Then we start iterating through the array starting from k, we remove the first element from the previous window and add a new element
    // ? arr[k] to this new window
    // ? Then compare the previous windowSum with the current windowSum, if its greater we write the maxSum
    public static int maxSumKConsecutiveElementsSW(int[] arr, int k){
        int currWindowSum = 0;
        // Loop to calculate the initial window sum
        for (int i = 0; i < k; i++) {
           currWindowSum+=arr[i];
        }
        int maxSum = currWindowSum;
        // Loop to remove the first element from the previous window and add a new element to the current window
        for (int i = k; i<arr.length; i++){
            currWindowSum = currWindowSum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, currWindowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSumKConsecutiveElementsSW(new int[]{1, 8, 30, -5, 20, 7}, 3));
    }
}
