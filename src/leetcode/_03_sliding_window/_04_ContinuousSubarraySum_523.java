package leetcode._03_sliding_window;

import java.util.HashMap;

public class _04_ContinuousSubarraySum_523 {
    // TODO - Given an integer array and integer k we have to determine if there exists an array of length of atleast 2 whose sum is a multiple of k
    // ex. nums = [23,2,4,6,7], k = 6 there exists subarray [2,4] so true
    // ex. nums = [23,2,6,4,7], k = 6 there exists subarray [23,2,6,4,7] so true
    // ex. nums = [23,2,6,4,7], k = 13 there is no way to form a subarray whose sum is divisible by 13

    // ? Approach - Calculate forward and reverse sum
    // ! Wrong approach since we're not dealing will middle element array
    public static boolean checkSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if (n < 2){
            return false;
        }
        int currSum = arr[0] + arr[1];
        if (currSum % k == 0) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            currSum += arr[i];
            if (currSum % k == 0) {
                return true;
            }
        }
        for (int i = 0; i < n - 2; i++) {
            currSum -= arr[i];
            if (currSum % k == 0) {
                return true;
            }
        }
        return false;
    }

    // ? Approach - Use a hashmap to store remainders
    // ? Obs - If we encounter the same remainder again means we've added elements such that they're a multiple of k
    // ex. [23,2,4,6,7] k = 6
    // At idx = 0 rem = 23%6 = 5
    // idx = 1, rem = 25%6 = 1
    // idx = 2, rem = 29%6 = 5
    // The remainder became same
    // means a sub array exists whose sum is divisible by k

    // ? We'll create a hashmap to store respective remainders
    public static boolean checkSubarraySumOpt(int[] arr, int k){
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(arr[0]%k, 0);
        int currSum = arr[0];
        for (int i = 1; i<arr.length; i++){
            currSum += arr[i];
            int rem = currSum%k;
            if (rem==0 || remainderMap.containsKey(rem)){
                return true;
            }
            else {
                remainderMap.put(rem, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSubarraySumOpt(new int[]{23,2,4,6,7}, 13));
    }
}
