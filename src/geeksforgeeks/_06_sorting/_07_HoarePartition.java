package geeksforgeeks._06_sorting;

import static java.util.Collections.swap;

public class _07_HoarePartition {
    // TODO Given a low index & high index we have to position the low(pivot) element in the array such
    // TODO elements on its left are smaller than or equal to it & elements on its right are greater than it.
    // ! We aren't trying to sort the array in any way
    // ex. {10,4,31,30} l = 0, h = 3, pivot = 10, o/p -> {4,10,31,30}

    // ? Approach - We keep 2 pointers left and right initially -1 and arr.length
    // ? When iterating we increment these pointers first in order to compare with the pivot element
    // ? If the left pointer encounters an element which is greater than or equal to pivot, we stop it. We shall use this pointer position to swap.
    // ? If the right pointer encounters an element which is smaller than or equal to pivot, we stop it. We shall use this pointer position to swap.
    // ? Swap left and right position elements.
    // ! Note the pointer values will not reset
    // ? Once the two pointers have crossed each other we return the partition index.
    // * The hoare partition is not stable & we also don't put pivot at its correct position but we get the partition position
    // * At this position left elements are smaller than all right elements
    // * Time - O(n) Space - O(n)
    public static int hoarePartition(int[] arr) {
        int pivot = arr[0];
        int left = -1;
        int right = arr.length;
        while (true) {
            // Keep moving left forward till we encounter an element which is greater or equal to pivot
            do {
                left++;
            } while (arr[left] < pivot);
            // Keep moving right backward till we encounter an element which is less or equal to pivot
            do {
                right--;
            } while (arr[right] > pivot);
            if (left >= right) {
                return right;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 8, 42, 7, 1, 0};
        hoarePartition(arr);
        int pivotP = hoarePartition(arr);
        System.out.println(pivotP);
        System.out.println("-----------------");
        for (int i: arr){
            System.out.println(i);
        }
    }
}
