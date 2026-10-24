package leetcode._01_arrays;

import java.util.Arrays;

public class _28_RotateArray {
    // TODO - Given an integer array, rotate it to the right k times.
    // So move the elements to the right by k positions
    // ! k is positive
    // ex. [1,2,3,4,5,6,7], k = 3
    // rotate 1 steps to the right: [7,1,2,3,4,5,6]
    // rotate 2 steps to the right: [6,7,1,2,3,4,5]
    // rotate 3 steps to the right: [5,6,7,1,2,3,4]

    // ? Method 1 Idea - Perform single rotation k times. Write a single rotation function and execute in k times
    // ? Time = O(n*k) Space = O(1)
    // ! TLE for Leetcode
    public static void SingleRotation(int[] arr) {
        int len = arr.length;
        int temp = arr[len - 1];
        for (int i = len - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static int[] RotateArr(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            SingleRotation(arr);
        }
        return arr;
    }

    // ? Method 2 Idea - Create a temporary array with elements that will be rotated
    // ? ex. {1,2,3,4,5,6,7}, k = 3, so temp arr of last 3 elements, then move the remaining elements to the end
    // ? Then simply copy the temp arr, elements to the beginning

    public static void RotateArrTemp(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            while (k > n) {
                k = k - n;
            }
        }
        if (n == 1) {
            System.out.println("Single element");
        } else {
            int[] temp = Arrays.copyOfRange(arr, n - k, n);
            int currElIdx = n - k - 1;
            int destinationIdx = n - 1;
            for (int i = destinationIdx; i >= k; i--) {
                arr[i] = arr[currElIdx];
                currElIdx--;
            }
            System.arraycopy(temp, 0, arr, 0, temp.length);
            for (int i : arr) {
                System.out.println(i);
            }
        }

    }

    // ? Method 2 Idea - Rotate sections of the array.
    // ? First rotate the 0 to len-k elements then len-k to len-1 and then finally reverse the whole array.

    public static void ReverseHelper(int[] arr, int startIdx, int endIdx) {
        while (startIdx <= endIdx) {
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }

    public static int[] RotateArrReversal(int[] arr, int k) {
        int n = arr.length;
        ReverseHelper(arr, 0, n - k - 1);
        ReverseHelper(arr, n - k, n - 1);
        ReverseHelper(arr, 0, n - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] res = RotateArrReversal(new int[] {1,2,3,4,5,6,7}, 3);
        for (int i: res){
            System.out.println(i);
        }
    }

}
