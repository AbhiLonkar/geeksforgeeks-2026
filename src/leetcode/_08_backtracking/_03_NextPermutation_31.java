package leetcode._08_backtracking;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_NextPermutation_31 {
    // TODO - Given an integer array we have to return its next permutation
    // ex. [1,2,3] op -> [1,3,2]
    // ex. [3,2,1] op -> [1,2,3]
    // ex. [1,1,5] op -> [1,5,1]

    // * Generating perms code

    public static void permutations(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        generatePerms(res, arr, 0, new ArrayList<>());
        System.out.println(res);
    }

    public static void generatePerms(List<List<Integer>> res, int[] arr, int pos, List<Integer> currArr) {
        int n = arr.length;
        if (currArr.size() == n) {
            res.add(new ArrayList<>(currArr));
            return;
        }
        for (int el : arr) {
            if (!currArr.contains(el)) {
                currArr.add(el);
                generatePerms(res, arr, pos + 1, currArr);
                currArr.remove(currArr.size() - 1);
            }
        }
    }

    // ! Code end

    // ? So the basic idea behind this problem is that we have to form a number just greater than the provided number
    // ex. [1,3,2,4] = 1324 just greater [1,3,4,2] = 1342
    // ex. [1,3,4,2] = 1342 just greater [1,4,2,3] = 1423

    // * How did we achieve this?
    // Ans. 1. We start from end and find out the first pair which follows this criteria -> arr[i] < arr[i+1]
    //      This is our pivot, after the pivot point the subarray formed is a decreasing subarray
    //      [1,3,4,2] pivot is at 1 after that elements start following decreasing order

    // 2. Next we start from end we find the element greater than pivot element
    // [1,3,4,2] -> is 2>3 no, is 4>3 yes.
    // So 4 is our rightmost element greater than pivot element

    // 3. We swap the pivot element and the rightmost greater element
    // [1,4,3,2]

    // 4. We then simply reverse the array after pivot point
    // [1,4,2,3]
    // Why reverse? Because without reversing we have [1,4,3,2] 1432 which is greater than [1,4,2,3] 1423
    // ! Remember we need the next permutation thats why we need to reverse the subarray


    // [2,1,3,4,5,7,6,5,4] found pivot at idx = 4 then for the subarray - [7,6,5,4] We find smallest element = 4
    // After finding the pivot point we need to swap it with the smallest element of the decreasing subarray
    // ! Solution
    // Find pivot point after which all elements are decreasing
    // Find the rightmost element just smaller than pivot element in the decreasing subarray
    // Then swap the pivot element and the smallest element
    // Then reverse all the elements after the pivot idx
    public static int[] nextPermutation(int[] nums) {
        // Finding pivot
        // ex. [2,1,3,4,5,7,6,5,4] decreasing subsequence starts after idx = 4
        int n = nums.length;
        int pivot = n - 2; // Assuming second last element is the pivot for first time
        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

        // Find rightmost element just smaller than pivot element
        if (pivot >= 0) {
            int rightMostSmallestElementIdx = n - 1;
            while (nums[pivot] >= nums[rightMostSmallestElementIdx]) {
                rightMostSmallestElementIdx--;
            }
            // Swap pivot and smallestElement
            swapper(nums, pivot, rightMostSmallestElementIdx);
        }

        // Reverse the subarray after pivot
        int start = pivot + 1;
        int end = n - 1;
        reverse(nums, start, end);
        return nums;
    }

    public static void swapper(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swapper(arr, start, end);
            start++;
            end--;
        }
    }

    private static boolean found = false;
    private static int[] result;

    public static int[] concatenatedDivisibility(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        result = new int[n];
        backtrack(arr, new int[n], new boolean[n], 0, k);
        return found ? result : new int[0];
    }

    private static void backtrack(int[] arr, int[] curr, boolean[] used, int pos, int k) {
        if (found) return;
        if (pos == arr.length) {
            BigInteger num = new BigInteger(String.join("", Arrays.stream(curr).mapToObj(String::valueOf).toArray(String[]::new)));
            if (num.mod(BigInteger.valueOf(k)).equals(BigInteger.ZERO)) {
                found = true;
                result = curr.clone();
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                curr[pos] = arr[i];
                backtrack(arr, curr, used, pos + 1, k);
                used[i] = false;
                while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] res = concatenatedDivisibility(new int[]{25900, 39695, 2584, 18305, 75986, 79563, 56939, 36282, 89720, 16517, 28547, 24732}, 57);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
