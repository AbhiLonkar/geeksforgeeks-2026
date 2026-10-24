package leetcode._01_arrays;

public class _51_PeakElement_162 {
    // TODO - Given a 0-indexed integer array nums, find a peak element, and return its index.
    // TODO - A peak element is an element that is strictly greater than its neighbors.
    // ex. nums = [1,2,3,1] Output: idx = 2, 3 is a peak element and your function should return the index number 2.

    // ? Approach - We'll go by comparing every adjacent element
    public static int isPeak(int[] arr) {
        int n = arr.length - 1;
        if (arr[0] > arr[1]) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        if (arr[n - 1] < arr[n]) {
            return n;
        }
        return -1;
    }

    public static int isPeakBinSearch(int[] arr) {
        int len = arr.length;
        // Only 1 element present
        if (len == 1) {
            return 0;
        }
        // Compare 2 element array
        if (arr[0] > arr[1]) {
            return 0;
        }
        // Compare last with second last element
        if (arr[len - 1] > arr[len - 2]) {
            return len - 1;
        }
        // Binary search if it lies in middle
        int start = 1, end = len - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int leftEl = arr[mid-1];
            int rightEl = arr[mid+1];
            if (arr[mid] >= leftEl && arr[mid] >= rightEl) {
                return mid;
            }
            if (arr[mid] < rightEl) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isPeak(new int[]{1, 2}));
    }
}
