package geeksforgeeks._04_arrays;

public class _10_MaximumSumSubarray {
    // TODO - Given an array, return the maximum possible sum from the possible sub-arrays
    // ex. {1,2,3,-3} so the subarray which forms the biggest sum is {1,2,3} = 1+2+3 = 6
    // Possible sub- arrays are - [1], [1,2], [1,2,3], [1,2,3,-3], [2], [2,3], [2,3,-3], [3], [3,-3]

    // ? Idea - Form subarray for each element then add each element of this subarray to the currSubArrSum.
    // ? Then check if the currSubArrSum is greater than the result sum, if it is then allocate currSubArrSum to the result.

    public static int MaximumSumSubArray(int[] arr) {
        int res = arr[0];
        // Iterate through each element
        for (int i = 0; i < arr.length; i++) {
            int currSubArraySum = 0;
            // form a subarray for ith element
            for (int j = i; j < arr.length; j++) {
                currSubArraySum += arr[j]; // add the element from the subarray to the currSubArraySum
                res = Math.max(res, currSubArraySum); // Compare it with the res, rewrite res if currSubArraySum greater
            }
        }
        return res;
    }

    // ? Idea - Track the currSubArraySum up to i, then make a choice whether to extend the sub array or a start a new one
    // ? if the new one gives more sum.
    public static int MaximumSumSubArrayOptimized(int[] arr) {
        int res = arr[0]; // Variable to track the global sum
        int maxSumSubArrayEndingWithI = arr[0]; // Variable to track the currSubArraySum
        for (int i = 1; i < arr.length; i++) {
            // Either extend the array by 1 position or start a new array if the current element by itself is larger than the
            // Sum of the current element and the previous value of maxSumSubArr;
            // We're calculating the sub array sum up to i on each iteration
            maxSumSubArrayEndingWithI = Math.max(arr[i], maxSumSubArrayEndingWithI+arr[i]);
            // If the MSS is more than the res, update the res.
            res = Math.max(maxSumSubArrayEndingWithI, res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(MaximumSumSubArray(new int[]{1, 2, -4, 5}));
        System.out.println(MaximumSumSubArrayOptimized(new int[]{-1, 2, -4, 5, 6}));
    }

}
