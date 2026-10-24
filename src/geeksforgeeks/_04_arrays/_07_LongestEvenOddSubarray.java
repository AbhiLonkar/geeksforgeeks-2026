package geeksforgeeks._04_arrays;

public class _07_LongestEvenOddSubarray {
    // TODO - In an array find the length of the largest subarray that has alternating even odd elements.
    // ! Note the subarray must be contiguous
    // ex. {2,3,4,5,7} - So the subarray is {2,3,4,5} length = 4
    // ex. {1,1,1,1} - So the subarray is {1} length = 1
    // ex. {3,8,1,3} - So the subarray is {3,8,1} length = 3

    // ? Idea - Try to form a subarray first, if the pattern of even odd breaks check if the curr subarray length is more than the res
    // ? If it is then update the res.
    // * Time complexity = O(n2) and Space = O(1);
    public static int LongestEvenOddSubArray(int[] arr) {
        int res = 0;
        // checking if the array is empty
        if (arr.length > 0) {
            // Iterate through the array
            for (int i = 0; i < arr.length; i++) {
                int currSubArrLen = 1; // variable representing the maximum length subarray formed for a particular value of i
                for (int j = i + 1; j < arr.length; j++) { // Iterate through the subarray
                    int prevEl = arr[j - 1];
                    int currEl = arr[j];
                    if ((prevEl % 2 == 0) && (currEl % 2 != 0) || (prevEl % 2 != 0) && (currEl % 2 == 0)) { // Even odd condition
                        currSubArrLen++;
                    }
                    // * Why break? Consider this - {1,2,3,11,6} when j reaches 11, arr[j-1] and arr[j] will be compared, the condition for
                    // * alternating even odd fails and the subarray breaks, so if we don't use break for current i, 11 and 6 will be compared,
                    // * since they meet the even odd condition the length will be incremented and answer will be wrong
                    else {
                        break;
                    }
                }
                // Compare res & current sub array length
                res = Math.max(res, currSubArrLen);
            }
        } else {
            return 0;
        }
        return res;
    }

    // ? Idea - Use kadane's algo, make a choice whether to extend the current sub array or start a new one.
    // ? What's the criteria to decide? Check if the previous element and the currEl match the alternating even odd criteria
    // ? If they do extend the sub array, if they don't start a new subarray with length 1
    // * Time = O(n) Space = O(1)
    public static int LongestEvenOddSubArrOptimized(int[] arr) {
        int resLen = 1;
        int currSubArrLen = 1;
        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            int currEl = arr[i];
            int prevEl = arr[i - 1];
            // Check if the criteria is met
            if ((currEl % 2 == 0 && prevEl % 2 != 0) || (currEl % 2 != 0 && prevEl % 2 == 0)) {
                // Extend the sub array if the criteria is met
                currSubArrLen++;
                // Compare with the res, if currSubArrLength more than update the res
                resLen = Math.max(resLen, currSubArrLen);
            }
            // The criteria of even odd breaks then start a new sub array
            else {
                currSubArrLen = 1;
            }
        }
        return resLen;
    }

    public static void main(String[] args) {
        System.out.println(LongestEvenOddSubArray(new int[]{1, 2, 3, 11, 6}));
        System.out.println(LongestEvenOddSubArrOptimized(new int[]{1, 2, 3, 12, 5, 6, 1}));
    }

}
