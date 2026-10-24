package leetcode._01_arrays;

public class _50_MaximumProductSubArray_152 {
    // TODO - Given an integer array, we need to find the maximum product that can be formed by a contiguous subarray

    // ? Approach 1 - We'll use double for loop to start sub arrays beginning with element at index i and we'll calculate each sub array product
    // ? We'll rewrite the maxProduct if it exceeds
    public static int maxProdSubArrayBrute(int[] arr) {
        int maxProduct = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currProduct = 1;
            for (int j = i; j < arr.length; j++) {
                currProduct *= arr[j];
            }
            maxProduct = Math.max(currProduct, maxProduct);
        }
        return maxProduct;
    }

    // ? Approach 2 - We'll calculate the prefix & suffix product for an element at position i
    // ? So first off lets try to find prefix product, dealing with all positive elements array
    public static int maxProductSubArray(int[] arr) {
        int result = Integer.MIN_VALUE;
        int prefixProduct = 1;
        int suffixProduct = 1;
        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
            if (prefixProduct == 0) {
                prefixProduct = 1;
            }
            if (suffixProduct == 0) {
                suffixProduct = 1;
            }
            suffixProduct *= arr[j];
            prefixProduct *= arr[i];
            result = Math.max(result, Math.max(prefixProduct, suffixProduct));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProductSubArray(new int[]{-2, 0, -1}));
    }
}
