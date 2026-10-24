package leetcode._01_arrays;

import java.util.HashMap;

public class _23_NumberOfPairsWithAbsDiffK {
    // TODO - Given an integer array and a target k, we have to find how many elements exist in array whose difference is equal to target
    // ! Note - Difference is absolute value and array size is small

    // ? Approach 1 - Double for loop check every element pair whose difference is equal to target
    public static int countKDifference(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // ? Approach 2 - Use a hashmap to calculate difference involving each element
    public static int countKDifferenceHashMap(int[] arr, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numsMap.containsKey(arr[i] - k)) {
                count += numsMap.get(arr[i] - k);

            }
            if (numsMap.containsKey(arr[i] + k)) {
                count += numsMap.get(arr[i] + k);
            }
            numsMap.put(arr[i], numsMap.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{3, 2, 1, 5, 4}, 2));
        System.out.println(countKDifferenceHashMap(new int[]{3, 2, 1, 5, 4}, 2));
    }

}
