package leetcode._01_arrays;

import java.util.Arrays;

public class _21_MaximumProductOf3Numbers_628 {
    // TODO - Given an integer array we have to return the max product that is formed by multiple three array elements
    // ex. {1,2,3,4,5} = 5*4*3 = 60
    // ex. {-1,-2,-3} = -1*-2*-3 = -6

    // ? Approach 1 - Maximum product is formed by multiply maximum numbers
    // ? Sort the array and multiply the last three numbers
    // * Time complexity - O(nlogn) & Space = O(n)
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return Math.max(arr[n - 3] * arr[n - 2] * arr[n - 1], arr[0] * arr[1] * arr[n - 1]);
    }

    // ? Find the 3 maximum elements and 2 minimum elements. Check the products like you did above;
    // ? First lets try to find out the 2 least elements
    // * Time complexity = O(n)
    public static int maxProductOptimized(int[] arr) {
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i : arr) {
            if (smallest > i) {
                secondSmallest = smallest;
                smallest = i;
            } else if (secondSmallest > i) {
                secondSmallest = i;
            }
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i: arr){
            if (i>max){
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            }
            else if (i>secondMax){
                thirdMax = secondMax;
                secondMax = i;
            }
            else if (i>thirdMax){
                thirdMax = i;
            }
        }
        return Math.max(smallest * secondSmallest * max, thirdMax*secondMax*max);
    }

    public static void main(String[] args) {
        System.out.println(maxProductOptimized(new int[]{-100, -98, 1, 2, 3, 4}));
    }
}
