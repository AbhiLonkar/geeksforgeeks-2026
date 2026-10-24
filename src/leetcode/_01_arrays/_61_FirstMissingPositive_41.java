package leetcode._01_arrays;

import java.util.*;

public class _61_FirstMissingPositive_41 {
    // TODO - Given a array, we have to find the first missing number
    // ex. arr = [1, 2, 0], in an ideal scenario the array should be [1,2,3] so 3 is missing
    // ex. arr = [3, 4, -1, 1] ideal array -> [1,2,3,4] so 2 is missing

    // ! Constraints
    // 1 <= nums.length <= 10^5
    // -2^31 <= nums[i] <= 2^31 - 1
    // * Need to solve it in O(n) time and uses O(1) auxiliary space

    public static int firstMissingNum(int[] arr) {
        int target = 1;
        Arrays.sort(arr); // O(nLogn) time
        for (int i = 0; i < arr.length; i++) {
            if (!binSearch(arr, target)) {
                return target;
            }
            target++;
        }
        return arr.length + 1;
    }

    public static boolean binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    // ? 1. Place the elements at its correct positions
    // ? 2. Ignore the elements which aren't in the range 1 <= element <= arr.length or already at the correct position
    // ? 3. The correct position of an element is element - 1
    // ex. {3,4,-1,1}, the ideal array for this input looks like this -> {1,2,3,4}
    // After placing all the elements correctly we get {1,-1,3,4}
    // We iterate from 1 to n (inclusive) the first index which which the criteria of i + 1 != element is our answer
    // If input array contains all elements from 1 to n the missing positive is always n + 1
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int start = 0;
        while (start < n) {
            int supposedCorrectPosition = arr[start] - 1;
            // Ignore negative and 0 elements
            if (arr[start] > 0 && arr[start] < n && arr[start] != arr[supposedCorrectPosition]) {
                int temp = arr[start];
                arr[start] = arr[supposedCorrectPosition];
                arr[supposedCorrectPosition] = temp;
            } else {
                start++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        System.out.println((firstMissingNum(new int[]{1, 2, 0})));
    }
}
