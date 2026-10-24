package leetcode._12_math;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _34_PermutationSequence_60 {
    // TODO - Given 2 integer n and k where n represents range from 1 to n and k represent the kth value
    //  We have to form permutations using numbers from 1 to n and then return the kth permutation

    // ex. n = 4, k = 9
    // num -> 1234
    // perms -> 1234,1243, 1324, 1342, 1423, 1432, 2134, 2143, 2314, 2341, 2413, 2431,...,4321
    // the 9th permutation of this sequence is 2314 so we return it

    // ? This problem looks like finding the next permutation of a number
    // ? First we'll just implement a function that calculates the next permutation for any given number


    public static void reverse(int[] perm, int i, int j) {
        while (i < j) {
            swapper(perm, i, j);
            i++;
            j--;
        }
    }


    public static void swapper(int[] perm, int i, int j) {
        int temp = perm[i];
        perm[i] = perm[j];
        perm[j] = temp;
    }

    // These are the steps -
    // Find pivot point after which all elements are decreasing
    // Find the rightmost element just smaller than pivot element in the decreasing subarray
    // Then swap the pivot element and the smallest element
    // Then reverse all the elements after the pivot idx

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivotIdx = n - 2;

        while (pivotIdx >= 0 && arr[pivotIdx] >= arr[pivotIdx + 1]) {
            pivotIdx--;
        }

        if (pivotIdx >= 0) {
            int rightMostSmallerThanPivot = n - 1;
            while (arr[pivotIdx] >= arr[rightMostSmallerThanPivot]) {
                rightMostSmallerThanPivot--;
            }
            swapper(arr, pivotIdx, rightMostSmallerThanPivot);
        }

        int start = pivotIdx + 1;
        int end = n - 1;
        reverse(arr, start, end);

    }

    public static String getPermutation(int n, int k) {
        int[] currPerm = new int[n];
        for (int i = 0; i < n; i++) {
            currPerm[i] = i + 1;
        }
        for (int i = 1; i<k; i++){
            nextPermutation(currPerm);
        }
//        while (k > 1) {
//            nextPermutation(currPerm);
//            k--;
//        }
        return Arrays.toString(currPerm);
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(4, 9));
    }


}
