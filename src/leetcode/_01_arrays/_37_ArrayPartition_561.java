package leetcode._01_arrays;

import java.util.Arrays;

public class _37_ArrayPartition_561 {
    // TODO - Given an integer array of size 2n, form pairs of the elements then from each pair pick the minimum element.
    // TODO - Add all the minimum elements from the pairs and return the maximum sum
    // ex. {1,2,3,4}
    // {1,2} {3,4} -> pick minimum from each -> 1 + 3 = 4
    // {1,3} {2,4} -> 1+2 = 3
    // {1,4} {2,3} -> 1+2 = 3
    // {1,2,3,4,5,6,7,8} - Notice that to get the maximum sum we have to keep the difference of the elements in the pair as small as possible
    // ex.{1,2} {3,4} {5,6} {7,8} - 1+3+5+7 = 16

    // ? So what we can do is that we can sort the array, iterate through the array in increments of 2.
    // ? Keep adding the elements at these positions to the sum and simply return the sum.
    public static int arrayPartition(int[] arr) {
        Arrays.sort(arr); // nlogn fxn
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPartition(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
