package geeksforgeeks._06_sorting;

import java.util.Arrays;

public class _10_KthSmallestElement {
    // TODO - Given an array and integer k we have to find the kth smallest element in the array
    // ex. {3,4,1,5} k = 2, o/p = 3

    // ? Approach 1 - Sort the array and return (k-1)th element
    public static int kthSmallestElement(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    // ? Approach 2 - Using lomuto partition
    // ? We know that lomuto partition finds a pivot and puts it in the right position, such that elements on left are smaller and on right are greater
    // ? We can use this position to find out kth smallest element
    // ? If the pivot is indeed at (k-1)th position then we simply return the pivot
    // ? If pivotIdx > k-1 then we move the end point to pivotIdx - 1
    // ? If pivotIdx < k-1 then we move the start point to pivotIdx + 1

    public static int lomutoPartition(int[] arr, int startIdx, int endIdx) {
        int i = startIdx - 1;
        for (int j = startIdx; j <= endIdx - 1; j++) {
            if (arr[j] <= arr[endIdx]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[endIdx];
        arr[endIdx] = temp;
        return i + 1;
    }

    public static int kthSmallestElementUsingPartition(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int partitionPoint = lomutoPartition(arr, start, end);
            if (partitionPoint == k - 1) {
                return arr[partitionPoint];
            } else if (partitionPoint > k - 1) {
                end = partitionPoint - 1;
            } else {
                start = partitionPoint + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(kthSmallestElementUsingPartition(new int[]{3, 4, 1, 5}, 2));
    }
}
