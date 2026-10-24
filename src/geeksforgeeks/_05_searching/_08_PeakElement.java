package geeksforgeeks._05_searching;

public class _08_PeakElement {
    // TODO - Given an integer array print the element which isn't smaller than its neighbours. Equal elements are allowed.
    // ex. {5,10,20,15,7} - So peak elements are 20
    // ex. {10,20,15,5,23,90,67} - 20 and 90

    // ? Approach - Check from the first element to the second last
    // ? For first element only check if the one on its right is smaller and for the last element check if the one on its left is smaller
    // * Time complexity = O(n) Space complexity = O(1)
    public static void peakElement(int[] arr) {
        int n = arr.length - 1;
        if (n == 0) {
            System.out.println(arr[0]);
        }
        if (arr[1] < arr[0]) {
            System.out.println(arr[0]);
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1]) {
                System.out.println(arr[i]);
                // Why i++? Because if element at ith position is peak, it means that element at (i+1)th position isn't peak. So skip that element
                i++;
            }
        }
        if (arr[n - 1] < arr[n]) {
            System.out.println(arr[n]);
        }
    }

    // ? Key idea: if arr[mid-1] < arr[mid] it means that the peak element lies on its right else it lies on the left
    // ? The code only gives out 1 peak tho
    public static int peakElementBinarySearch(int[] arr) {
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
//        System.out.println(peakElementBinarySearch(new int[] {5, 10, 20, 15, 7}));
        System.out.println(peakElementBinarySearch(new int[]{3,5,3,2,0}));
    }
}
