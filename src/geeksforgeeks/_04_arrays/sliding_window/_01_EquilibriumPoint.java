package geeksforgeeks._04_arrays.sliding_window;

public class _01_EquilibriumPoint {
    // TODO - Given an integer array find if there exists an equilibrium point.
    // An equilibrium point means that sum of the elements on the right is equal to sum of elements on the left
    // Eq point can be at the corners too in that case we consider sum on left or right = 0
    // ex. [3,4,8,-9,20,6] 20 is eq point since on left sum = 6 and right sum = 6;

    // ? Approach - Assume an element as the equilibrium, find the sum on its right and its left
    // ? Compare them
    public static boolean EquilibriumPoint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    // ? Approach 2 - Precompute prefix sum and suffix sum arrays

    // * prefix[i-1] = Sum of all elements on the left of i
    // * prefix[n-1] = Sum of all elements of the array
    public static int[] prefixSumArray(int[] arr) {
        int n = arr.length;
        int[] prefixArray = new int[n];
        prefixArray[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }
        return prefixArray;
    }

    // * suffix[i+1] = Sum of all elements on the right of i
    // * suffix[0] = Sum of all elements of the array
    public static int[] suffixSumArray(int[] arr) {
        int n = arr.length;
        int[] suffixArray = new int[n];
        suffixArray[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixArray[i] = suffixArray[i + 1] + arr[i];
        }
        return suffixArray;
    }

    // * So if at any i prefix[i-1] = suffix[i+1] it has to be an equilibrium point
    public static int EquilibriumPointOptimized(int[] arr) {
        int n = arr.length;
        int[] pfs = prefixSumArray(arr);
        int[] sfs = suffixSumArray(arr);
        // * sfs[1] = Sum of all elements from 1 to end
        if (sfs[1] == 0) {
            return arr[0];
        }
        // * pfs[n-2] = Sum of all elements from start to 2nd last element
        else if (pfs[n - 2] == 0) {
            return arr[n - 1];
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (pfs[i - 1] == sfs[i + 1]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static int EquilibriumPointSpaceOptimized(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            // Why? Because the sum of all the elements on the right side of ith element is given by subtracting the totalSum with the leftSum and the current element
            int rightSum = totalSum - leftSum - arr[i];
            if (rightSum == leftSum) {
                return arr[i];
            }
            // And we're calculating the sum of all the elements to the left of ith element after comparing the left and right sum
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 8, -9, -12, 9};
        System.out.println(EquilibriumPointOptimized(arr));
    }
}
