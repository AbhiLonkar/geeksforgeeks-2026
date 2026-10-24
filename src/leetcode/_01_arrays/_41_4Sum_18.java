package leetcode._01_arrays;

import java.util.*;

public class _41_4Sum_18 {
    // TODO - Given an integer array and target, we have to find 4 elements such that they add upto the target.
    // TODO - There can be multiple quadruplets in the array that add upto the target
    // ex. {1,0,-1,0,-2,2} target = 0 o/p - {{1,0,-1,0} {-2,2,0,0} {-2,1,2,-1}}

    // ? Approach 1 - Using quadruple for loops
    public static List<List<Integer>> fourSumForLoops(int[] arr, int target) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                for (int k = j + 1; k < arr.length - 1; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            result.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        }
                    }
                }
            }
        }
        return result;
    }

    // ? Approach 2 - Write the code for 3 Sum. In this approach we fix a single element use left and right pointers to search for elements
    // ? which come after the fixed element
    public static List<List<Integer>> threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            int diff = target - arr[i];
            while (start < end) {
                if (arr[start] + arr[end] == diff) {
                    result.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    start++;
                    end--;
                } else if (arr[start] + arr[end] > diff) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }

    // ? Approach 3 - Let's try to solve this problem by fixing 2 elements, but which 2 elements should we fix?
    // ? The elements adjacent to each other or the ones at the corners
    // * Time complexity = O(n3) and Space = O(1)
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            ;
            int fixedEl1 = arr[i];
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j - 1] == arr[j]) {
                    continue;
                }
                int fixedEl2 = arr[j];
                long diff = (long) target - fixedEl1 - fixedEl2;
                int start = j + 1;
                int end = arr.length - 1;
                while (start < end) {
                    long sum = (long) arr[start] + arr[end];
                    if (sum == diff) {
                        result.add(Arrays.asList(fixedEl1, fixedEl2, arr[start], arr[end]));
                        start++;
                        end--;
                        while (start < end && arr[start - 1] == arr[start]) {
                            start++;
                        }
                        while (start < end && arr[end + 1] == arr[end]) {
                            end--;
                        }
                    } else if (sum > diff) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
    }

}
