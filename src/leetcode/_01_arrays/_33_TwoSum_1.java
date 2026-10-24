package leetcode._01_arrays;

import java.util.HashMap;

public class _33_TwoSum_1 {
    // TODO - Given an integer array return 2 elements which when added return target.
    // ! Note - Only 1 such pair exists in the array
    // 1st idea double for loop
    // Time complexity O(n^2)
    public static int[] TwoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static int[] TwoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        // {number1: index1, number2: index2,....};
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int difference = target - currentNum;

            // Checks if the difference key is present in the map
            if (numsMap.containsKey(difference)) {
                // gives the index of the current element, and the index of the difference key in the map
                return new int[]{i, numsMap.get(difference)};
            }
            // Initially the map is empty
            // After the first iteration the first number & its index is added through this
            numsMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("False");
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 10, 20, 30, 40, 50, 60, 90, 4};
        int[] res1 = TwoSum(arr, 6);
        for (int i : res1) {
            System.out.println(i);
        }
        int[] res2 = TwoSumHash(arr, 6);
        for (int i : res2) {
            System.out.println(i);
        }
    }
}
