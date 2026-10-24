package geeksforgeeks._05_searching;

import java.util.Arrays;

public class _11_MedianOfTwoSortedArrays {
    // TODO - We're given 2 sorted arrays, we have to combine these two arrays to form a new sorted array.
    // TODO - And from this new array we have to find the median
    // ! Median of odd length array is middle element and median of even length array is sum of middle 2 numbers / 2

    // ? Form a temp array of length arr1 + arr2. Copy elements from arr1 and arr2 into temp. Sort the temp array and find the median
    // ! Below code is wrong, before copying we need to make sure that the order is correct
    // * Time complexity = O(templogtemp)
    public static void findMedianWrong(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int tempLen = n1 + n2;
        int[] temp = new int[n1 + n2];
        Arrays.sort(temp);
        System.arraycopy(arr1, 0, temp, 0, n1);
        System.arraycopy(arr2, 0, temp, n1, n2);
        int midPoint = tempLen / 2;
        if (tempLen % 2 != 0) {
            System.out.println(temp[midPoint]);
        } else {
            System.out.println((float) (temp[midPoint] + temp[midPoint - 1]) / 2);
        }
    }


    // ? Approach 2 - Using binary search
    // ? Partition the two arrays such that - elements in the left partition are less than or equal to elements in the right partition
    // ? Steps - First define partition point in the smaller array as the midpoint
    // ? Then for the bigger array the partition point is calculated with a formula
    // ? Define maxLeft1 and maxLeft2 as the points before the partition point of the respective arrays

    // ! Main gist is that the elements in the left partition must be less than or equal to the elements in the right partition

    public static double findMedian(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 > n2) {
            return findMedian(arr2, arr1);
        }
        int start = 0;
        int end = n1;
        while (start <= end) {
            int partition1 = start + (end - start) / 2;
            int partition2 = (n1 + n2 + 1) / 2 - partition1;
            int maxLeft1 = partition1 == 0 ? Integer.MIN_VALUE : arr1[partition1 - 1];
            int maxLeft2 = partition2 == 0 ? Integer.MIN_VALUE : arr2[partition2 - 1];
            int minRight1 = partition1 == n1 ? Integer.MAX_VALUE : arr1[partition1];
            int minRight2 = partition2 == n2 ? Integer.MAX_VALUE : arr2[partition2];
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((n1 + n2) % 2 == 0) {
                    return (double) (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                } else {
                    // ? because the median should come from the largest of the smaller elements in the left partition.
                    return Math.max(maxLeft1, maxLeft2);
                }
            }
            // * Making the correct partition point
            else if (maxLeft1 > minRight2) { // Meaning an element from the 1st array in the left partition is greater than an element from the 2nd array in the right partition
                // So remove that element by moving the end point in the 1st array
                end = partition1 - 1;
            } else {
                start = partition1 + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{23, 26, 31, 35}, new int[]{3, 5, 7, 9, 11, 16}));
    }

}
