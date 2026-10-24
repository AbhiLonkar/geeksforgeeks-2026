package geeksforgeeks._04_arrays;

import java.util.ArrayList;

public class _18_SecondLargestElement {
    // 1st Approach - Find the largest & then remove it then simply find the remaining largest
    // The problem comes that we'll need to convert arr to ArrayList since arr doesn't have remove method.
    public static int SecondLargestEl(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        int secondLargestEl = Math.min(arr[0], arr[1]);
        int largestEl = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largestEl) {
                secondLargestEl = largestEl;
                largestEl = arr[i];
            } else if (arr[i] != largestEl && arr[i] > secondLargestEl) {
                secondLargestEl = arr[i];
            }
        }
        if (secondLargestEl == largestEl) {
            return -1;
        }
        return secondLargestEl;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 400, 5};
        int[] arr1 = {10, 10, 10};
        int[] arr2 = {10, 10, 1000,100,100000};
        System.out.println(SecondLargestEl(arr));
        System.out.println(SecondLargestEl(arr1));
        System.out.println(SecondLargestEl(arr2));
    }
}
