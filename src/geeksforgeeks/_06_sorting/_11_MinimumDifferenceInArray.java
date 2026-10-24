package geeksforgeeks._06_sorting;

import java.util.Arrays;

public class _11_MinimumDifferenceInArray {

    // TODO - Given an integer array, find the minimum absolute difference between any two elements in the array.
    // ! The elements need not be adjacent with each other
    // ex. {1,8,12,5,18}, least diff = 8 - 5 = 3
    // ? Approach 1 - We'll set the min diff as max initially, double for loop
    // * Time - O(n2)
    public static int minDifferenceInArray(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                minVal = Math.min(minVal, diff);
            }
        }
        return minVal;
    }

    // ? Approach 2 - Minimum diff can be formed between adjacent elements in a sorted array
    // * Time - O(nlogn)
    public static int minDifferenceInSortedArray(int[] arr) {
        Arrays.sort(arr);
        int minVal = Integer.MAX_VALUE;
        int l = 0;
        while (l < arr.length - 1) {
            int diff = Math.abs(arr[l] - arr[l + 1]);
            minVal = Math.min(minVal, diff);
            l++;
        }
        return minVal;
    }


    public static void main(String[] args) {
        System.out.println(minDifferenceInArray(new int[]{1, 5, 3, 19, 18, 25}));
        System.out.println(minDifferenceInSortedArray(new int[]{1, 5, 3, 19, 18, 25}));
        System.out.println(minDifferenceInArray(new int[]{30, 5, 20, 9}));
        System.out.println(minDifferenceInSortedArray(new int[]{30, 5, 20, 9}));
    }
}
