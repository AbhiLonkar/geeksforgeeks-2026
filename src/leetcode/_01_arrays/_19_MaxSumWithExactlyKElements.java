package leetcode._01_arrays;

import java.util.Arrays;

public class _19_MaxSumWithExactlyKElements {
    // TODO - Given an array, find the maximum element, add the maximum element to the sum, remove maximum element from the array
    // TODO - Add element+1 to the array, perform this operation k times
    // ! 1 <= nums.length <= 100
    // ex. {1,2,3,4} k = 3
    // 1st iteration - sum = 0, max = 4
    // --> sum = 4, {1,2,3,5}
    // 2nd iteration - sum = 4, max = 5
    // --> sum = 4+5=9, {1,2,3,6}
    // 3rd iteration - sum = 9, max = 6
    // --> sum = 9+6=15, {1,2,3,7}

    // ? Idea - Find the max element, add to sum, put max+1 into array perform ops k times
    // ? Since the array size is small first we'll try to sort the array
    // * Time = O(nlogn) & space = O(n) sorting creates a duplicate array
    public static int MaxSumWithExactlyKElements(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int sum = 0;
        while (i < k) {
            sum += arr[arr.length - 1];
            arr[arr.length - 1] += 1;
            i++;
        }
        return sum;
    }

    // ? Optimized - Without sorting, just find the max element
    public static int MaxSumWithExactlyKElementsOptimized(int[] arr, int k) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        int sum = 0;
        while(k>0){
            sum+=max;
            max+=1;
            k--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(MaxSumWithExactlyKElementsOptimized(new int[]{1,2,3,4,5}, 3));
    }
}
