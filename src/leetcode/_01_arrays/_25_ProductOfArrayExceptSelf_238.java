package leetcode._01_arrays;

import java.util.Arrays;

public class _25_ProductOfArrayExceptSelf_238 {
    // TODO - Given an array, make an element at position be equal to product of all the remaining elements besides itself.
    // ! Do it in O(n)

    // ? Idea - Double for loop
    // * Time O(n2) Space O(n)
    public static int[] ProductArrayExceptSelf(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (temp[i] != temp[j]) {
                    product = product * temp[j];
                }
            }
            arr[i] = product;
        }
        return arr;
    }

    // ? Hint - Calculate the product on the left side and right side of the currEl in linear time
    // ? Create 2 separate arrays, one array to store the product of elements on the left of a number and one for the right
    public static int[] ProductArrayExceptSelfOptimized(int[] arr) {
        int[] leftProduct = new int[arr.length];
        int[] rightProduct = new int[arr.length];
        for (int i = 0, temp = 1; i < arr.length; i++) {
            leftProduct[i] = temp;
            temp = temp * arr[i];
        }
        for (int i = arr.length - 1, temp = 1; i >= 0; i--) {
            rightProduct[i] = temp;
            temp = temp * arr[i];
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = leftProduct[i] * rightProduct[i];
        }
        return res;
    }

    public static int[] ProductArrayExceptSelfOptimizedV2(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0, temp = 1; i < n; i++) {
            res[i] = temp;
            temp *= arr[i];
        }
        for (int i = n - 1, temp = 1; i >= 0; i--) {
            res[i] *= temp;
            temp *= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = ProductArrayExceptSelfOptimizedV2(new int[]{1, 2, 3, 4});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
